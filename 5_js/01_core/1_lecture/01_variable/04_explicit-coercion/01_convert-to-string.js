//명시적 타입 변환


//1. String 생성자 함수를 new 연산자 없이 호출
console.log(String(10));//"10"임
console.log(String(NaN));
console.log(String(Infinity));
console.log(String(true));
console.log(String(false));

//2. Object.prototype.toString 메서드 활용
console.log((10).toString());
console.log((NaN).toString());
console.log((Infinity).toString());
console.log((true).toString());
console.log((false).toString());

//3. 문자열 연결 연산자 이용 - 암묵적 변환 챕터에서 확인