/**method :  자바 스크립트의 함수는 객체이다, 함수는 값으로 취급할 수 있고 프로퍼티 값으로 사용 할 수 있다. */

let dog ={
    name:'뽀삐',
    eat: function(food){
        console.log(`${this.name}(은)는 ${food}를 맛있게 먹어요`);
    }
};

dog.eat('고구마');

//프로퍼티 접근

console.log(dog.name);

//대괄호 표기법 (square bracket notation) - 프로퍼티 키를 반드시 따옴표로 감싸야 한다.
console.log(dog['name']);
dog['eat']('고구마');

let obj={
    'dasy-key' : 'dasy-key',
    0:1
};

//반드시 키가 네이밍 규칙을 준수하지 않는 이름일 경우 반드시 대괄호 표기법 사용
// console.log(obj.dash-key); 이러면 안됨
console.log(obj['dasy-key']);


// 프로퍼티 키가 숫자로 이루어진 경우는 따옴표 생략 가능
console.log(obj[0]);
console.log(obj['0']);