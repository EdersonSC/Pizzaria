// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package pizzaria.domain;

import java.lang.Float;
import java.lang.String;
import java.util.Date;
import java.util.Set;
import pizzaria.domain.Pizza;

privileged aspect Pedido_Roo_JavaBean {
    
    public String Pedido.getNome() {
        return this.nome;
    }
    
    public void Pedido.setNome(String nome) {
        this.nome = nome;
    }
    
    public String Pedido.getEndereco() {
        return this.endereco;
    }
    
    public void Pedido.setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public Set<Pizza> Pedido.getPizzas() {
        return this.pizzas;
    }
    
    public void Pedido.setPizzas(Set<Pizza> pizzas) {
        this.pizzas = pizzas;
    }
    
    public Float Pedido.getTotal() {
        return this.total;
    }
    
    public void Pedido.setTotal(Float total) {
        this.total = total;
    }
    
    public Date Pedido.getDataEntrega() {
        return this.dataEntrega;
    }
    
    public void Pedido.setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
    
}
