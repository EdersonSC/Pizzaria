// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package pizzaria.domain;

import java.lang.String;

privileged aspect Cobertura_Roo_ToString {
    
    public String Cobertura.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(getNome());
        return sb.toString();
    }
    
}
