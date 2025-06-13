let number = /^\d{6}-\d{7}$/

// 정규표현식
// 이벤트 처리
// 이벤트 처리시 태그에 바로 적용하는 것


// 정규표현식 생성방법
// 주어진 문자열에서 특정 패턴을 찾거나 대체할 때 사용하는 특수한 문법
// 주로 문자열 유효성 검사, 검색, 치환 등에 사용

// 정규표현식은 /정규표현식/의 모양으로 작성한다.
// /^문자열$/ -> 문자열이 정확히 패턴과 일치해야 한다.
// ^ -> 문자열의 시작
// $ -> 문자열의 끝

var regex = /abc/
regex.text("abc"); // true;
regex.text("132abc456"); // true;
regex.text("ab"); // false;
// "abc"가 문자열의 어디에 있던지 포함만 되면 true


// "abc"가 문자열과 정확히 일치하는지 판별
// 앞뒤에 다른 글자가 있으면 false
var regex = /^abc$/
regex.text("abc"); // true;
regex.text("132abc456"); // false;
regex.text("ab"); // false;

// . : 아무 문자 한 글자
var regex = /h.t/; // h0t -> true;
regex.test("hat"); // true
regex.test("hit"); // true
regex.test("hoot"); // false

// * : 바로 앞의 문자가 0번이상 반복
var regex = /ab*c/ // b가 여러번 반복해도 true
regex.test("abc"); // true
regex.test("abbc"); // true
regex.test("abbbc"); // true

// + : 바로 앞의 문자가 1번 이상 반복
var regex = /ab+c/ // b가 1번 이상 반복해야 true
regex.test("ac"); // false
regex.test("abc"); // true
regex.test("abbc"); // true

// ? : 바로 앞의 문자가 0번 또는 1번만
var regtx = /ab?c/; // b가 0, 1이 아닌 경우 false
regex.test("ac"); // true
regex.test("abc"); // true
regex.test("abbc"); // false

// {n} : 바로 앞에있는 문자를 정확히 n번 반복
var regex = /ab{3}c/;
regex.test("abc"); // false
regex.test("abbc"); // false
regex.test("abbbc"); // true

// {n,m} : 바로 앞에있는 문자를 정확히 n번 이상 m번 이하 반복
var regex = /ab{2,4}c/;
regex.test("abc"); // false
regex.test("abbc"); // true
regex.test("abbbc"); // true
regex.test("abbbbc"); // true
regex.test("abbbbbc"); // false

// [문자] : 문자를 포함해야 한다.
// [abc] : 문자열이 a 또는 b 또는 c를 포함하면 된다.
var regex = /[abc]/; // a || b || c 와 같음
regex.test("a"); // true
regex.test("b"); // true
regex.test("c"); // true
regex.test("abd"); // true
regex.test("efg"); // false

// [^문자] : 문자를 포함하지 않아야 한다.
// [^abc] : a 또는 b 또는 c를 제외한 문자가 하나라도 있으면 참
// 문자열 안에 조건에 맞는 문자가 하나라도 있는지 검사
var regex = /[^abc]/;

regex.test("a"); // false
regex.test("b"); // false
regex.test("c"); // false
regex.test("abd"); // true
regex.test("efg"); // true

// [0-9] : 0 ~ 9를 포함하고 있는지
// \d 랑 같은 의미
// var regex = /^\d$/
var regex = /^[0-9]$/

// [a-z] : 소문자 a부터 소문자 z까지 포함
var regex = /[a-z]/
regex.test("abc123"); // ture
regex.test("abc"); // ture
regex.test("a"); // ture

var regex = /^[a-z]$/
regex.test("abc123"); // false
regex.test("abc"); // false
regex.test("a"); // ture

// A-Z : 대문자 A부터 대문자 Z까지
// \w : 영어 + 숫자 + 밑줄(_);
var regex = /[A-Z]/
regex.test("ABC123"); // ture
regex.test("ABC"); // ture
regex.test("A"); // ture

var regex = /[A-Z]/
regex.test("ABC123"); // false
regex.test("ABC"); // false
regex.test("A"); // ture

// 가-힣 : 가부터 힣까지

// 특수문자는 []에 들어가는것 제외 / \. / 과 같이 사용해야 한다.(\)사용

// 1. 한글 이름에 대한 유효성
// 한글로만 이루어진 문자열
// 길이는 2 ~ 5자
var regex = /^[가-힣]{2,5}$/
regex.test("김철수") // ture
regex.test("김영희") // ture
regex.test("kim") // false
regex.test("철수123") // false

// 2. 영어 소문자, 숫자만 허용하는 아이디
// 길이는 4 ~ 12자
var regex = /^[a-z][0-9]{4,12}$/

// 3. 이메일 형식 검사
// username@domain.단어 형태
// username은 영문 / 숫자 /./_ 포함 가능
// domain은 영문/숫자
//com은 영문/숫자, .com 또는 .net
var regex = /^[a-zA-Z0-9._]+@[a-zA-Z0-9]\.[a-zA-Z0-9comnet]$/
var regex = /^[\w.]+@[a-zA-Z0-9]+\.(com|net)$/
// /^유저네임+(1글자 이상)@도메인+(1글자 이상)\.(com또는net)$/

// 4. 휴대폰 번호 검사
// 010으로 시작
// 중간, 마지막 자리 숫자는 4자리
// 전체 형식 010-xxxx-xxxx
var regex = /^010-\d{4}-\d{4}$/

// 그룹화
// [abc] -> a, b, c중 하나
// (abc) -> abc가 한 단어
var regex = /(ha)+/
regex.test("ha"); // true
regex.test("haha"); // true
regex.test("hahaha"); // true

var regex = /h+a+/
regex.test("h"); // false
regex.test("ha"); // true
regex.test("haaa"); // true
regex.test("hhhhaaa"); // true

// | : or의 의미 그룹화와 같이 사용

var regex = /I (like|love) you/
regex.test("I love you");

// 그룹에서 값을 빼오는 것이 가능하다.
// match()
let str = "price : $300";
var result = str.match(/\$(\d+)/);

// result[0] : 정규식에 매칭된 전체 문자열
// result[1] : 첫 번째 그룹에 해당하는 값