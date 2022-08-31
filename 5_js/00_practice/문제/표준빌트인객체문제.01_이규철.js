// ## 5-1.  년, 월, 일을 전달하면 해당 날짜의 요일을 '월', '화', '수', '목', '금', '토', '일' 문자열로 반환해주는 함수 getWeekDay를 만든다.

// ### output
// ```
// 화
// 월
// ```

// ### code
// ```js
// console.log(getWeekDay(2022, 6, 21));       // 2022년 6월 21일
// console.log(getWeekDay(2022, 12, 12));      // 2022년 12월 12일 

function getWeekDay(year, month, date) {
  // 코드 작성
  const a = ['일','월','화','수','목','금','토'];
  const x = new Date(`${year}-${month}-${date}`).getDay();
  return a[x];
}

console.log(getWeekDay(2022,6,21));
console.log(getWeekDay(2022,12,12));


// ## 5-2. 오늘 흐른 시간을 초 단위로 알려주는 getSecondsToday 함수와 오늘 남은 시간을 초단위로 알려주는 getSecondsToTomorrow 함수를 만든다.

// ### output
// ``
// xxxxx초나 흘렀습니다. 시간을 소중히 씁시다^^
// xxxxx초 밖에 안 남았습니다. 다시는 오지 않는 오늘입니다^^
// ```

// ### code
// ```js`
console.log(`${getSecondsToday()}초나 흘렀습니다. 시간을 소중히 씁시다^^`);
console.log(`${getSecondsToTomorrow()}초 밖에 안 남았습니다. 다시는 오지 않는 오늘입니다.`);

function getSecondsToday() {
  // 코드 작성
  var now = new Date();
  let t1 = new Date(now.getFullYear(),now.getMonth(),now.getDate(),0,0,0).getTime();
  let t2 = new Date().getTime();
  let t3 = (t2-t1)/1000;
  return Math.floor(t3);
}

function getSecondsToTomorrow() {
  // 코드 작성
  var now = new Date();
  let t1 = new Date(now.getFullYear(),now.getMonth(),now.getDate()+1,0,0,0).getTime();
  let t2 = new Date().getTime();
  let t3 = (t1-t2)/1000;
  return Math.floor(t3);
}


// ## 5-3. 정규 표현식 (백준 9342)
// 상근이는 생명과학 연구소에서 염색체가 특정한 패턴인지를 확인하는 일을 하고 있다. 염색체는 알파벳 대문자 (A, B, C, ..., Z)로만 이루어진 문자열이다. 상근이는 각 염색체가 다음과 같은 규칙을 만족하는지 검사해야 한다.

// - 문자열은 {A, B, C, D, E, F} 중 0개 또는 1개로 시작해야 한다.
// - 그 다음에는 A가 하나 또는 그 이상 있어야 한다.
// - 그 다음에는 F가 하나 또는 그 이상 있어야 한다.
// - 그 다음에는 C가 하나 또는 그 이상 있어야 한다.
// - 그 다음에는 {A, B, C, D, E, F} 중 0개 또는 1개가 있으며, 더 이상의 문자는 없어야 한다.

// 문자열이 주어졌을 때, 위의 규칙을 만족하는지 구하는 프로그램을 작성하시오.

// ### output
// ```
// Good
// Infected!
// Infected!
// Infected!
// Infected!
// Infected!
// Good
// Good
// Good
// Good
// ```

// ### code
// ```js
const words = [
  '15',
  'AFC',
  'AAFC',
  'AAAFFCC',
  'AAFCC',
  'BAFC',
  'QWEDFGHJMNB',
  'DFAFCB',
  'ABCDEFC',
  'DADC'
];
let arr2 = new Array()

// 코드 작성
for(let i =0;i<words.length;i++){
  let arr = new Array();
  for(let j =0;j<words[i].length;j++){
    arr.push(words[i].charAt(j));
  }
  arr2.push(arr);
}
const regex = /^[A-F]?A+F+C+[A-F]?$/
for(let i=0;i<arr2.length;i++){
  console.log(arr2[i].toString());
  if(arr2[i].toString().match(regex)){
   
    console.log("Infected!");
  }else{
    console.log("Good");
  }
}
// for(let i = 0;i<arr2.length;i++){
//   let arr = new Array();
//   arr = arr2[i];
//   for(let j = 0; j<arr.length;j++){

//     if(j==0){
//       if(!first(arr[j])){
//         console.log("Infected!");
//         continue;
//       }
//     }

//     if(j==1){
//       if(selectA(arr[j])){
//         arr.replaceAll("A",'');
//         continue;
//       }else{
//         console.log("Infected!");
//         continue;
//       }
//     }

//     if(arr[j]=='') continue;
//     if(selectF(arr[j])){
//        arr.replaceAll("F",'');
//        continue;
//     }else{
//       console.log("Infected!");
//       continue;
//     }

//     if(selectC(arr[j])){
//       arr.replaceAll("C",'');
//       continue;
//    }else{
//      console.log("Infected!");
//      continue;
//    }
//   }
// }

// function first(s){
//   switch(s){
//     case 'A': return true;
//     case 'B': return true;
//     case 'C': return true;
//     case 'D': return true;
//     case 'E': return true;
//     case 'F': return true;
//     default: return false;
//   }
// }

// function selectA(s){
//   if(s=='A'){
//     return true;
//   }else{
//     return false;
//   }
// }

// function selectF(s){
//   if(s=='F'){
//     return true;
//   }else{
//     return false;
//   }
// }

// function selectC(s){
//   if(s=='C'){
//     return true;
//   }else{
//     return false;
//   }
// }

// const Main = () => {
//   const N = parseInt(inputs[0]);
//   const regex = /^[A-F]?A+F+C+[A-F]?$/
//   for (let i = 1; i <= N; i++) {
//     const line = inputs[i];

//     if (line.match(regex))
//       console.log('Infected!');
//     else
//       console.log('Good');
//   }
// }