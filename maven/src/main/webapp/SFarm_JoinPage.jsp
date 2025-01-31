<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>join</title>
    
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    
    <style>
        body {
            min-height: 100vh;
            background: -webkit-gradient(linear, left bottom, right top, from(#92b5db), to(#1d466c));
            background: -webkit-linear-gradient(bottom left, #92b5db 0%, #1d466c 100%);
            background: -moz-linear-gradient(bottom left, #92b5db 0%, #1d466c 100%);
            background: -o-linear-gradient(bottom left, #92b5db 0%, #1d466c 100%);
            background: linear-gradient(to top right, #92b5db 0%, #1d466c 100%);
        }

        .input-form {
            max-width: 680px;
            padding: 32px;
            background: #fff;
            -webkit-border-radius: 10px;
            -moz-border-radius: 10px;
            border-radius: 10px;
            -webkit-box-shadow: 0 8px 20px 0 rgba(0, 0, 0, 0.15);
            -moz-box-shadow: 0 8px 20px 0 rgba(0, 0, 0, 0.15);
            box-shadow: 0 8px 20px 0 rgba(0, 0, 0, 0.15);
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="input-form-backgroud row">
            <div class="input-form col-md-12 mx-auto">
                <h4 class="mb-3">회원가입</h4>
                <form action='S_JoinCon' class="validation-form" novalidate method='post'>
                    <div class="row">
                        <div class="col-md-6 mb-3">
                            <label for="mb_name">이름</label>
                            <input type="text" class="form-control" name="mb_name" placeholder="이름을 입력해주세요." required>
                            <div class="invalid-feedback">
                                이름을 입력해주세요.
                            </div>
                        </div>
                    </div>

                    <div class="mb-3">
                        <label for="mb_id">회원 아이디</label>
                        <input type="text" class="form-control" id="mb_id" name="mb_id" placeholder="아이디를 입력해주세요." required>
                        <div class="invalid-feedback">
                            아이디를 입력해주세요.
                        </div>
                        <button type="button" id="idCheck" class="btn btn-secondary mt-2">아이디 중복 확인</button>
                        <div id="idCheckResult" class="mt-2"></div>
                    </div>

                    <div class="mb-3">
                        <label for="mb_pw">비밀번호</label>
                        <input type="password" class="form-control" name="mb_pw" placeholder="비밀번호를 입력해주세요." required>
                        <div class="invalid-feedback">
                            비밀번호를 입력해주세요.
                        </div>
                    </div>

                    <div class="mb-3">
                        <label for="mb_phone">회원 연락처<span class="text-muted">&nbsp;(필수 아님)</span></label>
                        <input type="text" class="form-control" name="mb_phone" placeholder="연락처를 입력해주세요.">
                    </div>

                    <div class="mb-3">
                        <label for="farm_info">농가 정보</label>
                        <input type="text" class="form-control" name="farm_info" placeholder="농가정보를 입력해주세요." required>
                        <div class="invalid-feedback">
                            농가정보를 입력해주세요.
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-8 mb-3">
                            <label for="root">회원 구분</label>
                            <select class="custom-select d-block w-100" id="root" name="mb_type">
                                <option value=""></option>
                                <option >농가회원</option>
                                <option >소비자</option>
                            </select>
                            <div class="invalid-feedback">
                                회원구분을 선택해주세요.
                            </div>
                        </div>
                    </div>

                    <hr class="mb-4">
                    <div class="custom-control custom-checkbox">
                        <input type="checkbox" class="custom-control-input" id="aggrement" required>
                        <label class="custom-control-label" for="aggrement">개인정보 수집 및 이용에 동의합니다.</label>
                    </div>
                    <div class="mb-4"></div>
                    <button class="btn btn-primary btn-lg btn-block" type="submit">가입 완료</button>
                </form>
            </div>
        </div>
        <footer class="my-3 text-center text-small">
            <p class="mb-1">&copy; 2024 SFarm</p>
        </footer>
    </div>

    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script>
        $(document).ready(function() {
            $('#idCheck').click(function() {
                var mb_id = $('#mb_id').val();
                if(mb_id === "") {
                    alert("아이디를 입력해주세요.");
                    return;
                }

                $.ajax({
                    url: 'idCheckCon',
                    type: 'POST',
                    data: { mb_id: mb_id },
                    success: function(response) {
                        $('#idCheckResult').text(response);
                    },
                    error: function(xhr, status, error) {
                        console.error('AJAX 요청 실패: ' + error);
                    }
                });
            });

            const forms = document.getElementsByClassName('validation-form');
            Array.prototype.filter.call(forms, function(form) {
                form.addEventListener('submit', function(event) {
                    if (form.checkValidity() === false) {
                        event.preventDefault();
                        event.stopPropagation();
                    }
                    form.classList.add('was-validated');
                }, false);
            });
        });
    </script>
</body>
</html>
