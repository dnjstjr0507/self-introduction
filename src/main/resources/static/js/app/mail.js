var mail = {
    init : function () {
        var _this = this;
        $('#btn-send-email').on('click', function () {
            _this.send();
        });
    },
    send : function () {
        var data = {
            name: $('#name').val(),
            email: $('#email').val(),
            message: $('#message').val()
        };

        $.ajax({
            type: 'POST',
            url: '/email',
            dataType: 'json',
            contentType:'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function() {
            alert('메일이 전송되었습니다.');
            location.reload();
        }).fail(function (error) {
            alert('메일 전송에 실패하였습니다.');
            alert(error);
        });
    }

};

mail.init();