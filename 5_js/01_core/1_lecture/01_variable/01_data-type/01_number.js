/*01. 숫자 타입
자바의 경우 정수 실수를 구분해 int,long,float,double 과 같은 숫자타입을 제공
자바스크립트 의 경우 하나의 숫자 타입만 존재, 모든 수를 실수 처리
*/

// 정수 실수 음수 모두 숫자 타입
const integer = 10;
const double = 5.5;
const negative = -10;

console.log(integer);
console.log(10===10.0);

/*
    숫자 타입은 세 가지 특별한 값도 표현 할 수 있다.
    Infinity: 양의 무한대
    -Infinity: 음의 무한대
    NaN: 산술 연산 불가(Not A NUMBER)
*/

console.log(10/0);
console.log(10/-0);
console.log(1*"문자열");