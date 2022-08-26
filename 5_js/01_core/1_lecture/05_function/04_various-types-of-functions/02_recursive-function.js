//재귀함수
//함수가 자기자신을 호출하는 것을 재귀 호출, 반복되는 처리를 위해 사용

function  factorial(n){
    if(n<=1) return 1;
    return n*factorial(n-1); // 재귀호출
}

console.log(factorial(1));
console.log(factorial(2));
console.log(factorial(3));
console.log(factorial(4));
console.log(factorial(5));