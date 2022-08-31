// 01. iterable and array-like (이터러블과 유사 배열)
/* 이터러블(iterable) : 메서드 Symbol.iterator가 구현된 객체
유사 배열(array-like) : 인덱스와 length 프로퍼티가 있어서 배열처럼 보이는 객체*/

let arrayList = {
    0: "배열 인듯",
    1:"배열 아닌",
    2:"배열 같은 너",
    length:3
}

// 배열 메서드 사용불가.
// console.log(arrayList.pop());  TypeError: arrayList.pop is not a function

//Array.from: 넘겨받은 인수가 유사배열, 이터러블 인 경우 새로운배열 만들고 새롭게 만든 배열로 복사.
let arr=Array.from(arrayList);
console.log(arr.pop());

let range = {
    from:1,
    to:5
};

//이터러블은 메서드 Symbol.iterator 가 구현된 객체
// 일반 객체는 Symbol.iterator 메서드를 소유하지 않는다. 따라서 이터러블이 아님.

//for of로 최초호출시 Symbol.iterator 가 호출됨
range[Symbol.iterator]=function(){
    return {
        current : this.from,
        last: this.to,

        //for of 반복문에 의해 반복마다 next() 호출됨.
        next(){  // next()는 값을 객체 형태로 반환.
            if(this.current<=this.last){
                return {done:false,value:this.current++}; //done이 true 이면 반복이 끝났음을 의미, 끝나지 안ㄶ을 경우 value는 다음 값이 된다.
            }else{
                return{done:true};
            }
        }
    }
};

let arr2 = Array.from(range);
console.log(arr2);

let arr3 = Array.from(range,num=> num*num);
console.log(arr3);