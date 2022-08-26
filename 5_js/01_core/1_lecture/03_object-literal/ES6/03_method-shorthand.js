//메서드 단축

//ES5 - 메서드를ㄹ 정의하려면 프로퍼티 값으로 함수를 할당
let dog={
    name:'뽀삐',
    eat: function(food){
        console.log(`${this.name}(은)는 ${food}를 냠냠`);
    }
};

dog.eat('고구마');

//ES6 - function 키워드를 생략해 축약 사용 가능
let dog2={
    name:'뽀삐',
    eat(food){
        console.log(`${this.name}(은)는 ${food}를 냠냠`);
    }
};

dog2.eat('고구마');