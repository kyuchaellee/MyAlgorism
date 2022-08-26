/**symbol 타입
 * 
 * ES6에서 추가된 7번 째 타입으로, 변경 불가능한 원시 타입의 값이다.
 * 다른 값과 중복되지 않은 유일 무이한 값으로 이름 충돌할 위험이 없는 객체의
 * 유일한 프로퍼터키를 만들기 위해 사용./
 * 심벌 이외의 원시 값은 리터럴을 통해 생성,심벌은 Symbol 함수를 통해 생성
 */

//심벌 값 생성
let key=Symbol('key');
console.log(typeof key);

// 객체 생성
let obj={};

//이름이 충돌할 위험이 있는 유일무이한 값인 심벌을 프로터티 키로 사용을 한다.
obj[key]='value';
console.log(obj[key]);

//number,string,boolean,undefined,null,symbol 데이터 타입 이외에는 모두 객체 타입이다.