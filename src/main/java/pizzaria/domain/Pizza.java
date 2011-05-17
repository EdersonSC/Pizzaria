package pizzaria.domain;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.persistence.Column;
import javax.validation.constraints.Size;
import java.util.Set;
import pizzaria.domain.Cobertura;
import java.util.HashSet;
import javax.persistence.ManyToMany;
import javax.persistence.CascadeType;
import pizzaria.domain.Massa;
import javax.persistence.ManyToOne;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;

@RooJavaBean
@RooToString
@RooEntity
public class Pizza {

    @NotNull
    @Column(unique = true)
    @Size(min = 2)
    private String nome;

    private Float preco;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Cobertura> coberturas = new HashSet<Cobertura>();

    @ManyToOne
    private Massa massa;
}
