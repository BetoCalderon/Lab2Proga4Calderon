package com.unab.edu.lab2proga4calderon

class vehiculo(){
    var marca:String?=null
        get() = field
        set(value) {
            if(value == null){
                println("Ingrese un marca")
            }
            else if(value!!.isEmpty()) {
                println("Ingrese un marca")
            }else{
                field = value
            }
        }

    var modelo:String?=null
        get() = field
        set(value) {
            if(value == null){
                println("Ingrese un modelo")
            }
            else if(value!!.isEmpty()) {
                println("Ingrese un modelo")
            }else{
                field = value
            }
        }
}