// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package pizzaria.domain;

import java.lang.String;

privileged aspect Pizza_Roo_ToString {
    
    public String Pizza.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(getNome()).append(", ");
        sb.append("Preco: ").append(getPreco()).append(", ");
        sb.append("Coberturas: ").append(getCoberturas() == null ? "null" : getCoberturas().size()).append(", ");
        sb.append("Massa: ").append(getMassa());
        return sb.toString();
    }
    
}
