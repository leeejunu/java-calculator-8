# 요구사항 작성

## 기능 
- [X] 빈 문자열 입력시 0을 반환한다.
- [X] 숫자만 포함된 문자열이면 숫자 값으로 반환한다.
- [X] 기본 구분자(쉼표, 콜론)를 기준으로 분리한 각 숫자의 합을 반환한다.
- [X] 문자열 앞부분의 "//"와 "\n"사이에 위치하는 문자(커스텀 구분자)를 기준으로 분리한 각 숫자의 합을 반환한다. 

## 예외 처리
- [X] 음수 입력시 IllegalArgumentException 발생시킨다.
- [X] 기본 구분자 외의 문자(숫자 제외) 포함시 IllegalArgumentException 발생시킨다.
- [X] 커스텀 구분자가 한 글자가 아닌 경우 IllegalArgumentException 발생시킨다.
- [X] 커스텀 구분자 외의 문자(숫자 제외) 포함시 IllegalArgumentException 발생시킨다.
- [X] 커스텀 구분자가 숫자인 경우 IllegalArgumentException 발생시킨다.
- [X] 숫자가 양수가 아닌 경우 IllegalArgumentException 발생시킨다.
- [X] 구분자의 위치가 잘못된 경우(시작, 끝, 또는 연속된 구분자) IllegalArgumentException 발생시킨다.