import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("Seja Bem-vindo ao programa que calcula áreas!")
    println("Informe qual figura geométrica deseja calcular:")
    println("1. Triângulo")
    println("2. Retângulo")
    println("3. Losango")
    println("4. Trapézio")
    println("5. Circunferência")
    print("Escolha uma opção de 1 á 5: ")

    val escolha = scanner.nextInt()

    when (escolha) {
        1 -> calcularAreaTriangulo(scanner)
        2 -> calcularAreaRetangulo(scanner)
        3 -> calcularAreaLosango(scanner)
        4 -> calcularAreaTrapezio(scanner)
        5 -> calcularAreaCircunferencia(scanner)
        else -> println("Opção inválida. Por favor, escolha uma opção válida.")
    }

    scanner.close()
}

fun calcularAreaTriangulo(scanner: Scanner) {
    println("Escolha o tipo de triângulo:")
    println("1. Triângulo Equilátero")
    println("2. Triângulo Isósceles")
    println("3. Triângulo Escaleno")
    print("Escolha uma opção 1 á 3: ")

    val tipoTriangulo = scanner.nextInt()

    when (tipoTriangulo) {
        1 -> calcularAreaTrianguloEquilatero(scanner)
        2 -> calcularAreaTrianguloIsosceles(scanner)
        3 -> calcularAreaTrianguloEscaleno(scanner)
        else -> println("Opção inválida. Por favor, escolha uma opção válida.")
    }
}

fun calcularAreaTrianguloEquilatero(scanner: Scanner) {
    print("Informe o lado do triângulo equilátero: ")
    val lado = scanner.nextDouble()

    val area = (Math.sqrt(3.0) / 4) * lado * lado
    println("A área do triângulo equilátero é: $area centímetros quadrados.")
}

fun calcularAreaTrianguloIsosceles(scanner: Scanner) {
    print("Informe a base do triângulo isósceles: ")
    val base = scanner.nextDouble()
    print("Informe a altura do triângulo isósceles: ")
    val altura = scanner.nextDouble()

    val area = 0.5 * base * altura
    println("A área do triângulo isósceles é: $area centímetros quadrados.")
}

fun calcularAreaTrianguloEscaleno(scanner: Scanner) {
    print("Informe o lado 1 do triângulo escaleno: ")
    val lado1 = scanner.nextDouble()
    print("Informe o lado 2 do triângulo escaleno: ")
    val lado2 = scanner.nextDouble()
    print("Informe o lado 3 do triângulo escaleno: ")
    val lado3 = scanner.nextDouble()

    val s = (lado1 + lado2 + lado3) / 2
    val area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3))
    println("A área do triângulo escaleno é: $area centímetros quadrados.")
}

fun calcularAreaRetangulo(scanner: Scanner) {
    print("Informe a largura do retângulo: ")
    val largura = scanner.nextDouble()
    print("Informe a altura do retângulo: ")
    val altura = scanner.nextDouble()

    val area = largura * altura
    println("A área do retângulo é: $area centímetros quadrados.")
}

fun calcularAreaLosango(scanner: Scanner) {
    print("Informe a diagonal maior do losango: ")
    val diagonalMaior = scanner.nextDouble()
    print("Informe a diagonal menor do losango: ")
    val diagonalMenor = scanner.nextDouble()

    val area = 0.5 * diagonalMaior * diagonalMenor
    println("A área do losango é: $area centímetros quadrados.")
}

fun calcularAreaTrapezio(scanner: Scanner) {
    print("Informe a base maior do trapézio: ")
    val baseMaior = scanner.nextDouble()
    print("Informe a base menor do trapézio: ")
    val baseMenor = scanner.nextDouble()
    print("Informe a altura do trapézio: ")
    val altura = scanner.nextDouble()

    val area = 0.5 * (baseMaior + baseMenor) * altura
    println("A área do trapézio é: $area centímetros quadrados.")
}

fun calcularAreaCircunferencia(scanner: Scanner) {
    print("Informe o raio da circunferência: ")
    val raio = scanner.nextDouble()

    val area = 3.14 * ( raio * raio)
    println("A área da circunferência é: $area centímetros quadrados.")
}