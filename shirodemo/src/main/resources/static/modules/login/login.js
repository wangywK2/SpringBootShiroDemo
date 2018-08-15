/**
 * JS程序入口
 */
$(function(){
  $("#submitBtn").click(function(){
      var username=$("#username").val();
      var password=$("#password").val();

      var usernameReg =/^[\u4E00-\u9FA5A-Za-z0-9_]{2,10}$/;
      var passwordReg =/^^[a-zA-Z0-9]\w{5,12}$$/;
      if(!usernameReg.test(username)){
          alert("用户名不符合规范：(原因：用户名由2-10位中文、字母、数字和下划线组成)");
          return;
      }
      if(!passwordReg.test(password)){
          alert("密码不符合规范：(原因：密码由6-12位字母、数字和下划线组成)");
          return;
      }
      $.ajax({
          type: "post",
          url: "/login",
          data: {
              "username": username,
              "password": password
          },
          success: function(r) {
              if (r.success === true) {
                  location.href = '/index';
              } else {
                  alert("登陆失败！")
              }
          },
          error:function(res){
          }
      });
  })
})

//密码强度正则，最少6位，包括至少1个大写字母，1个小写字母，1个数字，1个特殊字符
//var pPattern = /^.*(?=.{6,})(?=.*\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%^&*? ]).*$/;
//输出 true
//console.log("=="+pPattern.test("iFat3#"));