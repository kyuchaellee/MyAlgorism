//상속

class Animal{
    constructor(name,weight){
        this.name = name;
        this.weight = weight;
    }

    eat(foodWeight){
        this.weight+=foodWeight;
        console.log(`${this.name}(은)는 ${foodWeight}kg의 식사를 하고 ${this.weight}kg이 되었습니다.`);
    }

    move(lostWeight){
        if(this.weight > lostWeight)
            this.weight -= lostWeight;
        console.log(`${this.name}은 움직임으로 인해 ${lostWeight}kg 감량되어 ${this.weight}kg이 되었습니다.`);
    }
}

let animal = new Animal("동물",30);
animal.eat(1);
animal.move(0.5);

class Human extends Animal{
    develop(language){
        console.log(`${this.name}(은)는 ${language}로 개발을 합니다. 정말 즐겁습니다^.^`);
    }
}

let human = new Human("수강생",70);
human.eat(2);
human.move(1);
human.develop("Java");

class Tiger extends Animal{
    attack(target){
        console.log(`${this.name}은 ${target}을 공격합니다.`);
    }
    move(target){
        super.move(0.1);
        this.attack(target);
    }
}

let tiger = new Tiger("백두산 호랑이",90);
tiger.attack("사슴");
tiger.move("사슴");

class Deer extends Animal{
    constructor(name,weight,leglength){
        super(name,weight); // 반드시 this 사용하기 전에 호출.
        this.leglength=leglength;
    }

    hide(place){
        console.log(`${this.name}은 ${place}에 숨습니다.`);
    }
}

let deer = new Deer("사슴",40,1);
deer.hide("동굴안");