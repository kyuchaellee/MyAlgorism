//객체 구조 분해 할당
let pants ={
    productName: "배기팬츠",
    color: "검정색",
    price: 30000
}

let {productName,color,price} = pants;

console.log(productName);
console.log(color);
console.log(price);

//{객체 프러퍼티: 목표 변수}
let{color: co, price: pr, productName: pn}= pants;

console.log(co);
console.log(pr);
console.log(pn);




let shirts = {
    productName: "베이직 셔츠"
};

//초기값 할당 가능.
let {productName: productName2 = "어떤상품", color: color2 = "어떤 색상",price:price2=0}=shirts;
console.log(productName2);
console.log(color2);
console.log(price2);

let{productName: productName3} = pants;
console.log(productName3);

let{productName: productName4,...rest} = pants;
console.log(productName3);
console.log(rest.color);
console.log(rest.price);


let productName5,color5,price5;
({productName:productName5,color:color5,price:price5 = 0}=pants);
console.log(productName5);
console.log(color5);
console.log(price5);

// 중첩 구조 분해
let product = {
    size: {
        width : 10,
        height : 30
    },
    items : ["doll","robot"]
};

let {
    size:{
        width,
        height
    },
    items:[item1,item2]
    // producer: "홍길동";
} = product;

// console.log(product.size.height);
console.log(width);
console.log(height);
console.log(item1);
console.log(item2);

let{
    size,
    items
} = product;
console.log(size.width);


//함수의 매개변수에 적용
//함수의 매개변수가 많거나 기본 값이 필요한 경우 활용, 순서도 고정되지 않아도 됨.
function displayProduct({producer ="아무개",width=0,height=0,items=[]}){
    console.log(`${producer} ${width} ${height}`);
    console.log(items);
};

let exProduct = {
    items:["Coffe","Donut"],
    producer:"리효이"
}
displayProduct(exProduct);