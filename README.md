SpringBoot + JPA + Handlebars.js + Gradle


2019.05.06 
    -> 프로젝트 생성 

2019.05.07 게시글 저장 및 게시판 불러오기 완성
    -> ※ 참고 및 출처 : jojoldu님 tistory  https://jojoldu.tistory.com/250?category=635883
  
  ~ 2019.05.08

2019.05.19 template적용 
※ 목표 : SPA Template선택 및 개발 설계
    -> ※ 출처 : https://html5up.net/dimension

2019.05.20
※ 목표 : contact Mail 기능 완성
    -> Mail 설정중 에러 발생 
    -> ● application.yml 에서 SMTP 비밀번호에 특수문자 사용시 에러 발생, smtp.naver.com 이용시 에러 발생
    -> ● 에러 해결 방법 : smtp.gmail.com 을 사용, 특수문자 제거
    
2019.05.21 
    -> Mail 완성 및 index.hbs의 문의 메일 보내기 적용
    
2019.05.22
※ 목표 : 방명록 목록의 제목 1개 클릭후 비밀번호 입력시 일치하면 전체 내용 보이기 
    -> ● Posts 의 Entity가와 PostsMainResponseDto의 활용을 제대로 이해하지 못하였음

2019.05.23
    -> ● JPARepository를 이용해 가져온 후  Posts Entit에 담아 PostsMainResponseDto로 변환하는 방법을 생각 못함
    -> ● 사용할 메소드 안에 PostsMainResponseDto 객체를 생성하여 파라미터에 가져온 Posts Entity를 담아주어 해결
       + 게시글 한개 불러오기 추후업데이트 예정 PostsRepository, PostsService 완성 Contorller 수정필요 
