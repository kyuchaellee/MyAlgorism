/*02. 문자열 타입
  문자열 타입은 텍스트 데이터를 나타내는데 사용
  문자열은 작은 따옴표(''), 큰 따옴표(""), 백틱(`) 으로 텍스트를 감싼다.
  자바는 문자열을 객체로 표현하지만
  자바스크립트의 문자열은 원시 타입, 변경 불가능한 값이다.
*/

let string;
string='JavaScript';
string="JavaScript";
string=`JavaScript`; // 백틱(ES6)

string='작은 따옴표로 감싼 문자열 내의 "큰따옴표"는 문자열로 인식';
string="작은 따옴표로 감싼 문자열 내의 '큰따옴표'는 문자열로 인식";

console.log(string);

/**
 * 템플릿 리터럴
 * ES6 도입된 멀티 라인 문자열, 표현삽입 등의 문자열 처리 기능 제공하는 문자열 표기법
 */

var str="안녕하세요"
"반갑습니다";
console.log(str);  // 일반 문자열 내에서는 줄바꿈 허용 안됨.

var str2 = '안녕하세요.\n반갑습니다.';
console.log(str2);//이스케이프 시퀀스를 사용해야 한다.


//백틱 사용하면 줄바꿈도 허용되고 모든 공백이 있는 그대로 적용된다.
var multiline = `안녕하세요.
반갑습니다.`;
console.log(multiline);

const lastName='이';
const firstName='효리';

//문자열은 문자열 연산자 + 를 사용해 연결 할 수 있다.
console.log('제 이름은 '+lastName+firstName+' 입니다.');

//표현식 삽입 ${} 이용하면 문자열
console.log(`제 이름은 ${lastName}${firstName} 입니다.`);
//표현식 삽입은 반드시 백틱 사용.
console.log('제 이름은 ${lastName}${firstName} 입니다.');

