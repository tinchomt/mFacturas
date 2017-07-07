package com.mt

class Cliente {

     String cuit
     String razonSocial
     String domicilio		
     String descripcion		

    static constraints = {
	cuit blank: false
	razonSocial blank: false
	domicilio blank: false
    }

String toString(){
	razonSocial
    }	
}
