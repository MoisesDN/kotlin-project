package br.com.moisesdias.secao7

data class Coordinates(var x: Int, var y: Int) {
    operator fun plus(other: Coordinates): Coordinates {
        return Coordinates(this.x + other.x, this.y + other.y)
    }
}
