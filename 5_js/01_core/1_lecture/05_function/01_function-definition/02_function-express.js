//함수 표현식
// 자바스크립트의 함수는 객체 타입의 값으로, 값의 성질을 갖는 객체를 일급 객체라고 한다.
//함수는 일급객체 이기 때문에 함수 리터럴로 생성한 함수 객체를 변수에 할당 할 수 있다.


//함수 표현식에는 함수명을 생략할 수 있다.
let hello=function(name){
    return `${name} 님 하이요`
}

//식별자로 함수를 호출한다.
console.log(hello('이효리'));

let calc=function add(a,b){  // 함수명 add 생략하지 않아도 된다.
    return a+b;
}
console.log(calc(10,20));  // 호출은 식별자로