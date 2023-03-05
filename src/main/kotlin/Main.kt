import java.util.Scanner
import javax.management.ImmutableDescriptor

// null-safe 즉, None 값이 있을 확률이 매우 적다
// 타입 뒤에 아무런 표시가 없으면 절대 설정되지 않은 값을 올 수 없다.
// 타입 뒤에 ? 표시를 붙이면 설정되지 않은 값이 올 수 있다.

// 매개변수의 경우 혹은 해당 변수의 타입이 불명확한 경우에는
// 반드시 타입 힌트를 적어야 한다.

// Int      -> 정수 ( 21억 ~ -21억 까지 )
// Long     -> 정수 ( 900경~ -900경 )
// Short    -> 정수 ( 32757 ~ 32xxx )
// Byte     -> 정수 ( 127~ -128 )

// Float    -> 실수 ( 4byte )
// Double   -> 실수 ( 8byte ) [ Float * 2 ]

// Char     -> 문자 ( 2byte ) [ 한국어, 영어, 일본어 ]
// String   -> 문자열 ( ?byte )

// Boolean  -> 논리값 ( true / false )
fun add(a:String, b:Int) {


}

fun main() {

    // val, var
    // val - value      -> 변하지 않는 값 (상수)
    // var - variable   -> 변할 수 있는 값 (변수)
    // 변수의 타입을 변경할 수 없다.
    // 함수는 def -> fun 으로 선언한다.

    // val(변하지 않는)
    // var(변할 수 있는)
    // 문자열은 무조건 "" 만 사용

    // kotlin 의 List 는 추가가 불가능하다.
    // MutableList(변경가능), ImmutableList(변경불가능)

    // List, immutable          = tuple [변경 불가능]
    // MutableList, ArrayList   = list [변경 가능]
    // Set                      ~= set [변경 불가능]
    // MutableSet, HashSet      = set [변경 가능]
    // Map                      ~= dict [변경 불가능]
    // MutableMap, HashMap      = dict [변경 가능]

//    val li = mutableMapOf(
//        "나비" to 10, "고양이" to 20
//    )
//
//    li["호빵"] = 30;
//
//    print(li["호빵"])

    // until, .. , downTo, step ...
//    for(i in 0 .. 5) {
//        println(i)
//    }
    print("입력하세요 : ")
    val data = readln() // 절대 설정되지 않는 값이 올 수 없는 경우 개발자가 !! 붙여서 확실하게 값이 있다고 알릴 수 있음.
    data.toInt()
    // NumberFormatException -> 숫자가 아닌 데이터를 숫자로 바꾸려고 할 때

    // data : String? 에는 값이 없을수도있다... 하고 kotlin 이 알려준 경우...
    // length -> 문자열 계열에 .length 해서 쓸 수 있는데 결과는 해당 문자열의 길이다. (Int)
    // ? 의 결과를 가진 값들은 애초에 컴파일 할 수 없다.
    //  data = 안녕하세요 => 5
    //  data = null

    println(data?.length)

}
