//배열,문자열은 대표적인 이터러블ㄴ

for(let char of "JavaScript"){
    console.log(char);
}
let str="iterable";
let iterator= str[Symbol.iterator()];

while(true){
    let result = iterator.next();
    if(result.done) break;
    console.log(result.value);
}