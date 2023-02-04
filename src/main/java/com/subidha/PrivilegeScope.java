package com.subidha;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = " privilege_scope")
public class PrivilegeScope {

    String psId;
    String scopeName;
    String isActive;

    public String getPsId() {
        return psId;
    }

    public void setPsId(String psId) {
        this.psId = psId;
    }

    public String getScopeName() {
        return scopeName;
    }

    public void setScopeName(String scopeName) {
        this.scopeName = scopeName;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }
}
