package com.mt

class Estado {

    String nombre
	
    static constraints = {
	nombre blank: false
    }

    String toString(){
	nombre
    }	
}
