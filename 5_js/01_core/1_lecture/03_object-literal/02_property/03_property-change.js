let dog={
    name: '뽀삐'
};

dog.name='두부'
//dog['name'] = '두부'  도 가능함.
console.log(dog);

dog.age=3;  // 존재하지 않는 프로퍼티에 값 할당 시 동적으로 생성되어 추가
console.log(dog);

delete dog.age;  // 삭제도 가능
delete dog.something; // 존재 안하는 프러퍼티를 삭제하려고 하면 그냥 무시함.
console.log(dog);