// 즉시 실행 함수
// 함수정의 와 동시에 즉시 호출되는 함수로 단 한번만 호출되며 다시 호출할 수 없다.

(function(){
    console.log('익명으로 즉시 실행 함수~함수정의와 동시에 호출~~');
})();

(function hello(name){
    console.log('기명으로 즉시 실행 함수 ~ 함수정의와 동시에 호출~~');
    console.log(`${name}님 아룡하세요`);
})('이효리');

// hello('dbdb'); hello is not defined 에러 발생

//즉시 실행 함수는 반드시 () - 그룹 연산자로 감싸야한다.
