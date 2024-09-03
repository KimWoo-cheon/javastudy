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
                <h4 class="mb-3">ȸ������</h4>
                <form action='S_JoinCon' class="validation-form" novalidate method='post'>
                    <div class="row">
                        <div class="col-md-6 mb-3">
                            <label for="mb_name">�̸�</label>
                            <input type="text" class="form-control" name="mb_name" placeholder="�̸��� �Է����ּ���." required>
                            <div class="invalid-feedback">
                                �̸��� �Է����ּ���.
                            </div>
                        </div>
                    </div>

                    <div class="mb-3">
                        <label for="mb_id">ȸ�� ���̵�</label>
                        <input type="text" class="form-control" id="mb_id" name="mb_id" placeholder="���̵� �Է����ּ���." required>
                        <div class="invalid-feedback">
                            ���̵� �Է����ּ���.
                        </div>
                        <button type="button" id="idCheck" class="btn btn-secondary mt-2">���̵� �ߺ� Ȯ��</button>
                        <div id="idCheckResult" class="mt-2"></div>
                    </div>

                    <div class="mb-3">
                        <label for="mb_pw">��й�ȣ</label>
                        <input type="password" class="form-control" name="mb_pw" placeholder="��й�ȣ�� �Է����ּ���." required>
                        <div class="invalid-feedback">
                            ��й�ȣ�� �Է����ּ���.
                        </div>
                    </div>

                    <div class="mb-3">
                        <label for="mb_phone">ȸ�� ����ó<span class="text-muted">&nbsp;(�ʼ� �ƴ�)</span></label>
                        <input type="text" class="form-control" name="mb_phone" placeholder="����ó�� �Է����ּ���.">
                    </div>

                    <div class="mb-3">
                        <label for="farm_info">�� ����</label>
                        <input type="text" class="form-control" name="farm_info" placeholder="�������� �Է����ּ���." required>
                        <div class="invalid-feedback">
                            �������� �Է����ּ���.
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-8 mb-3">
                            <label for="root">ȸ�� ����</label>
                            <select class="custom-select d-block w-100" id="root" name="mb_type">
                                <option value=""></option>
                                <option >��ȸ��</option>
                                <option >�Һ���</option>
                            </select>
                            <div class="invalid-feedback">
                                ȸ�������� �������ּ���.
                            </div>
                        </div>
                    </div>

                    <hr class="mb-4">
                    <div class="custom-control custom-checkbox">
                        <input type="checkbox" class="custom-control-input" id="aggrement" required>
                        <label class="custom-control-label" for="aggrement">�������� ���� �� �̿뿡 �����մϴ�.</label>
                    </div>
                    <div class="mb-4"></div>
                    <button class="btn btn-primary btn-lg btn-block" type="submit">���� �Ϸ�</button>
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
                    alert("���̵� �Է����ּ���.");
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
                        console.error('AJAX ��û ����: ' + error);
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
