//객체 리터럴을 반환하는 경우는 소괄호로 감싼다.
const createUser = (id,name)=>({id,name});
console.log(createUser(1,'리효이'));

//고차함수에 인수로 전달 가능하고 일반 함수 표현식 보다 간결하여 자주 사용
console.log([1,2,3,4,5].map(val=>val*10));

// 화살표 함수는 this를 가지지않는다.
let theater = {
    store: "건대점",
    titles: ["어벤져스", "겨울왕국", "스파이더맨", "라이온킹", "알라딘"],

    shewMovieList(){
        this.titles.forEach(
            title=>console.log(this.store + ':' + title)
        );
    }
}

theater.shewMovieList();

// 화살표 함수는 new 와 함께 호출 할 수 없다.
const arrowFunc = () => {};
// new arrowFunc(); TypeError: arrowFunc is not a constructor
console.log(arrowFunc.hasOwnProperty('prototype'));


//화살표 함수는 arguments 지원하지 않음.
(function(){
    const arrowFunc=()=>console.log(arguments);

    arrowFunc(3,4);
}(1,2));