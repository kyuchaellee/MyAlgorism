
/** 콜백 함수
 * 함수의 매개변수를 통해 다른 함수의 내부로 전달되는 함수를 콜백함수라고 함.
 * 다른 함수에 매개변수로 넘겨준 함수
 * 매개 변수로 넘겨받은 함수는 일단 넘겨받고 때가되면 나중에 호출(called back) 한다는 것.
 * 매개 변수를 통해서 함수의 외부에서 콜백 함수를 전달받는 함수를 고차함수 라 한다.
 */

//전달받은 값을 증가시켜 주는 콜백 함수
function increase(value){
    return value+1;
}

// 전달 받은 값을 감소시켜주는 콜백 함수
function decrease(value){
    return value-1;
}

//전달 받은 함수에 전달받은 값을 적용시켜주는 고차 함수
function apply(func,value){
    // 고차함수는 매개변수를 통해 전달받은 콜백함수의 호출 시점을 결정할 수 있다.
    // 콜백함수는 고차함수에 의해 호출되고 이때 고차함수는 필요에 따라 콜백함수에 인자를 전달 할 수 있다.
    return func(value);
}

console.log(apply(increase,5));
console.log(apply(decrease,5));

console.log(apply(function(value){return value*2;},5))