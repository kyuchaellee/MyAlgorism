/** const
 *  상수를 사용하기 위해 사용
 *  let 키워드와 마찬가지로 블록 레벨 스코프를 가지며, 변수 호이스팅이 발생하지 않는 것처럼 동작
 */

// const로 선언한 변수는 반드시 선언과 동시에 초기화
const x= 1;
// x=2; TypeError: Assignment to constant variable. 재할당 불가 

//const 상수 표기 권장사항
const DISCOUNT_RATE = 0.15;

let price=15000;
let discountPrice = price*(1-DISCOUNT_RATE);

console.log(discountPrice);


//const 키워드로 선언된 변수에 객체를 할당한 경우 내부 값을 변경할 수 있다.
const student={
    name:'you',
    age:20
};

student.name="리효이";
console.log(student);

// student={}; TypeError: Assignment to constant variable. 재할당은 불가능.

/* ES6를 사용한다면 var 키워드는 사용하지 않는다.
재할당이 필용한 경우에 한정해 let 키워드를 사용하며 변수의 스코프는 최대한 좁게 만든다.
변경이 발생하지 않고 읽기 전용으로 사용하는 원시 값과 객체에는 const 키워드를 사용한다.
const 키워드는 재할당을 금지하므로 var, let 키워드보다 안전한다.
*/