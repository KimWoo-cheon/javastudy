<%@page import="com.smhrd.model.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        * {
            margin: 0;
            padding: 0;
        }
        body {
            width: 90%;
            background-image: url(./img/농가등록페이지최종.jpg);
            background-size: cover;
            background-repeat: no-repeat;
        }
        .content {
            margin: 0 auto;
        }
        .wrap {
            height: 800px;
            width: 90%;
            background: #fff;
            margin: 0 auto;
            border-radius: 10px;
            box-sizing: border-box;
        }
        .wrap h1 {
            width: 100%;
            font-size: 32px;
            padding-bottom: 12px;
            border-bottom: 3px solid #000;
            letter-spacing: -2px;
        }
        .wrap dl {
            display: flex;
            align-items: center;
            margin-top: 20px;
            padding: 10px;
        }
        .wrap dt {
            width: 20%;
            font-size: 14px;
        }
        .wrap dd {
            width: 75%;
            margin-left: 10px;
        }
        .wrap input[type="text"] {
            padding: 10px;
            border-radius: 5px;
            width: 100%;
            box-sizing: border-box;
        }
        .wrap input[type="button"] {
            padding: 5px 10px;
            border: 0;
            background: #325cb2;
            color: #fff;
            font-weight: 600;
            cursor: pointer;
        }
        .wrap textarea {
            width: 100%;
            padding: 10px;
            box-sizing: border-box;
            resize: vertical;
            border-radius: 5px;
        }
        .wrap input[type="submit"] {
            display: block;
            margin: 15px auto 0 auto;
            padding: 8px 25px;
            border-radius: 100px;
            background: #325cb2;
            font-weight: 600;
            color: #fff;
            cursor: pointer;
        }
        .added-dl {
            margin-top: 10px; /* 추가된 항목 간격 */
        }
    </style>
</head>
<body>
<%
    // session에 user_info가 있는지 없는지 확인 
    MemberDTO user_info = (MemberDTO) session.getAttribute("user_info");
%>
    <div class='content'>
        <form action="S_JoinFarmCon" method="post" class="wrap">
            <h1>농장등록</h1>
            <dl>
                <dt>농가명</dt>
                <dd><input name="fh_nick" type="text" placeholder="농가 이름을 입력해주세요.(홍보용 이름)"></dd>
            </dl>
                        <dl>
                <dt>사업자명</dt>
                <dd><input name="fh_name" type="text" placeholder="사업자 혹은 인증 등록된 이름"></dd>
            </dl>
            <dl>
                <dt>대표자</dt>
                <dd><input name="fh_owner" type="text" placeholder="대표자 이름을 입력해주세요."></dd>
            </dl>
             <dl>
                <dt>지역</dt>
                <dd><input name="fh_region" type="text" placeholder="지역 이름을 입력해주세요."></dd>
            </dl>
            <dl>
                <dt>농작물<br><input id="addButton" type="button" value="추가" onclick="addInputField()"></dt>
                <dd id="agriContainer"><input name="agri_names" type="text" placeholder="품명을 입력하세요"></dd>
            </dl>
            <dl>
                <dt class="mg">소개메세지</dt>
                <dd><textarea name="fh_intro" type="text" placeholder="간단히 소개해주세요"></textarea></dd>
            </dl>
            <input type="submit" value="등록하기" class="button fit">
        </form>
    </div>
    <script>
        function addInputField() {
            const agriContainer = document.getElementById('agriContainer');
            const newInput = document.createElement('input');
            newInput.name = 'agri_names';
            newInput.type = 'text';
            newInput.placeholder = '품명을 입력하세요';
            newInput.style.marginTop = '10px'; // 새로 추가된 input 간의 간격을 줄입니다.
            agriContainer.appendChild(newInput);
        }
    </script>
</body>
</html>
