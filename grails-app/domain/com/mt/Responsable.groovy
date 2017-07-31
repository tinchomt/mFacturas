package com.mt

class Responsable {

	Integer dni
    String nombre
    String apellido
	
    static constraints = {
	    dni blank: false	
		nombre blank: false
		apellido blank: false
    }

    String toString(){
		nombre
    }	
}
