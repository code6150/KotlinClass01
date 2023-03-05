class Person (
    val name: String,
    val age: Int,
    val phone: String
    ) {

    // kotlin 에서의 함수 작명법
    // camelCase -> 첫 글자 소문자 이어지는 단어 첫 글자 대문자
    // kotlin 함수에서는 self 가 자동으로 무시된다.
    // kotlin 함수에서는 self 는 this 로 바꿔쓴다.
    fun printInfo() {
        println("이름 : $name, 나이 : $age, 번호 : $phone")
    }

}