## 기능 구현 Task
- [ ] 정답 단어를 고른다.
  - 정답은 `매일 바뀌며 ((현재 날짜 - 2021년 6월 19일) % 배열의 크기) 번째의 단어`
- [ ] 초기 문구를 출력한다.
  - `WORDLE을 6번 만에 맞춰 보세요. 시도의 결과는 타일의 색 변화로 나타납니다.`
- [ ] `정답을 입력해 주세요.`를 출력한다
- [ ] 입력을 받는다.
  - 입력한 단어가 5글자 미만인 경우
    - `Not enough letters` 문구를 출력하고 입력을 재시도한다.
  - `words.txt` 파일에 존재하지 않는 단어를 입력할 경우
    - `Not in word list` 문구를 출력하고 입력을 재시도한다.
- [ ] 정답을 확인하고 이력을 저장한다. (input -> 각 단어를 체크 -> 타일로 정답을 변환 -> 타일을 이력에 저장)
  - 입력한 단어와 정답을 비교한다.
    - 글자가 정답 안에 없는 경우 : ⬜
    - 글자가 정답 안에 포함됐지만 위치가 다른 경우 : 🟨
    - 글자가 정답 안에 포함됐고 위치가 같은 경우 : 🟩
  - 단어를 타일로 변환 및 타일을 이력으로 저장한다.
  - 입력이 정답이 아닐 경우
    - 시도 횟수가 남아있을 경우
      - 입력을 다시 받음
      - 시도 이력을 모두 출력
    - 6번 모두 시도 했을 경우
      - x/6 출력
      - 시도 이력을 모두 출력
  - 입력이 정답일 경우
    - 몇번만에 맞췄는지 출력한다 (ex: 4/6)
    - 시도 이력을 모두 출력한다.