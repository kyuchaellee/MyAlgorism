/**03_implicit-coercion 암묵적 타입변환
 * 
 * 명시적 타입 변환은 코드에서 들어나지만
 * 암묵적 타입 변환은 드러나지 않으므로 
 * 타입 변환된 결과를 예측 할 수 있어야 오류를 방지할 수 있다
 */

//문자열 타입으로 변환
//문자열 연결 +로 피연산자를 문자열로 변환
console.log(10+'20');

//템플릿 리터럴 표현식 삽입은 표현식의 결과를 문자열 타입으로 변환
console.log(`10+20 : ${10+20}`);

//문자열 타입이 아닌 값을 문자열 타입으로 암묵적으로 변환한 결과
console.log(1+'');//"1"
console.log(NaN+'');
console.log(Infinity + '');      
console.log(true + '');           
console.log(null + '');           
console.log(undefined + '');        
/*console.log(Symbol() + '');*/// Cannot convert a Symbol value to a string      
console.log([] + '');              
console.log(function(){} + '');  