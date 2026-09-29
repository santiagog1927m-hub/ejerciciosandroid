package com.example.ejercicioskotlin

/*
Ejercicio 1

class Persona(
    val nombre: String,
    val edad: Int
) {
    fun presentarse() {
        println("Hola, soy $nombre y tengo $edad años")
    }
}

fun ejercicio1() {
    val persona = Persona("Ana", 25)
    persona.presentarse()
}
*/


/*
Ejercicio 2

class Automovil(
    val marca: String,
    val modelo: String,
    val año: Int
) {
    constructor(marca: String, modelo: String) : this(
        marca,
        modelo,
        2025
    )
}

fun ejercicio2() {
    val auto1 = Automovil("Toyota", "Corolla", 2024)
    val auto2 = Automovil("Mazda", "CX-5")

    println("${auto1.marca} ${auto1.modelo} ${auto1.año}")
    println("${auto2.marca} ${auto2.modelo} ${auto2.año}")
}
*/


/*
Ejercicio 3

open class Animal {

    open fun hacerSonido() {
        println("El animal hace un sonido")
    }
}

class Perro : Animal() {

    override fun hacerSonido() {
        println("Guau")
    }
}

class Gato : Animal() {

    override fun hacerSonido() {
        println("Miau")
    }
}

fun ejercicio3() {
    val perro = Perro()
    val gato = Gato()

    perro.hacerSonido()
    gato.hacerSonido()
}
*/


/*
Ejercicio 4

data class Libro(
    val titulo: String,
    val autor: String,
    val año: Int
)

fun ejercicio4() {
    val libro1 = Libro(
        "Cien años de soledad",
        "Gabriel García Márquez",
        1967
    )

    val libro2 = Libro(
        "El principito",
        "Antoine de Saint-Exupéry",
        1943
    )

    println(libro1)
    println(libro2)

    val libro3 = libro1.copy(año = 2020)

    println(libro3)
}
*/


/*
Ejercicio 5

interface Reproducible {

    fun play()

    fun pause()
}

class Cancion : Reproducible {

    override fun play() {
        println("Reproduciendo canción")
    }

    override fun pause() {
        println("Canción pausada")
    }
}

class Video : Reproducible {

    override fun play() {
        println("Reproduciendo video")
    }

    override fun pause() {
        println("Video pausado")
    }
}

fun ejercicio5() {
    val cancion = Cancion()
    val video = Video()

    cancion.play()
    cancion.pause()

    video.play()
    video.pause()
}
*/


/*
Ejercicio 6

interface Repositorio<T> {

    fun agregar(item: T)

    fun obtener(id: Int): T

    fun eliminar(id: Int)

    fun tamano(): Int
}

class RepositorioMemoria<T> : Repositorio<T> {

    private val lista = mutableListOf<T>()

    override fun agregar(item: T) {
        lista.add(item)
    }

    override fun obtener(id: Int): T {
        return lista[id]
    }

    override fun eliminar(id: Int) {
        lista.removeAt(id)
    }

    override fun tamano(): Int {
        return lista.size
    }
}

fun ejercicio6() {
    val repositorio = RepositorioMemoria<String>()

    repositorio.agregar("Hola")
    repositorio.agregar("Mundo")

    println(repositorio.obtener(0))
    println(repositorio.obtener(1))

    println("Cantidad: ${repositorio.tamano()}")

    repositorio.eliminar(1)

    println("Cantidad después de eliminar: ${repositorio.tamano()}")
}
*/


/*
Ejercicio 7

interface Volador {

    fun volar()
}

interface Nadador {

    fun nadar()
}

class Pato : Volador, Nadador {

    override fun volar() {
        println("El pato está volando")
    }

    override fun nadar() {
        println("El pato está nadando")
    }
}

fun ejercicio7() {
    val pato = Pato()

    pato.volar()
    pato.nadar()
}
*/


/*
Ejercicio 8

enum class DiaSemana {
    LUNES,
    MARTES,
    MIERCOLES,
    JUEVES,
    VIERNES,
    SABADO,
    DOMINGO
}

fun ejercicio8() {
    val numero = 3

    val dia = DiaSemana.values()[numero - 1]

    println("El día es $dia")
}
*/


/*
Ejercicio 9

enum class Moneda(val simbolo: String) {
    DOLAR("$"),
    EURO("€"),
    PESO("COP$")
}

fun ejercicio9() {
    for (moneda in Moneda.values()) {
        println("${moneda.name}: ${moneda.simbolo}")
    }
}
*/


/*
Ejercicio 10

enum class Nivel(val puntos: Int) {

    BAJO(10),
    MEDIO(50),
    ALTO(100);

    fun esMayorQue(nivel: Nivel): Boolean {
        return this.puntos > nivel.puntos
    }
}

fun ejercicio10() {
    val nivel1 = Nivel.ALTO
    val nivel2 = Nivel.MEDIO

    println("${nivel1.name}: ${nivel1.puntos} puntos")
    println("${nivel2.name}: ${nivel2.puntos} puntos")

    println(
        "${nivel1.name} es mayor que ${nivel2.name}: " +
                nivel1.esMayorQue(nivel2)
    )
}
*/

