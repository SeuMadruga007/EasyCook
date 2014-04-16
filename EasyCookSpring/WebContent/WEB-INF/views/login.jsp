<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <title>Login Page</title>
    <meta name="msapplication-TileColor" content="#5bc0de" />
    <meta name="msapplication-TileImage" content="dist/assets/img/metis-tile.png" />
    <link rel="stylesheet" href="dist/assets/lib/magic/magic.css">
    <link rel="stylesheet" href="dist/assets/lib/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="dist/assets/css/main.css">
    <script>
      (function(i, s, o, g, r, a, m) {
        i['GoogleAnalyticsObject'] = r;
        i[r] = i[r] || function() {
          (i[r].q = i[r].q || []).push(arguments)
        }, i[r].l = 1 * new Date();
        a = s.createElement(o),
        m = s.getElementsByTagName(o)[0];
        a.async = 1;
        a.src = g;
        m.parentNode.insertBefore(a, m)
      })(window, document, 'script', '//www.google-analytics.com/analytics.js', 'ga');
      ga('create', 'UA-1669764-16', 'onokumus.com');
      ga('send', 'pageview');
    </script>
    
    <script  src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
  </head>
  <body  class="login" >
    <div class="container">
      <div class="text-center">
        <img src="img/easyCook.png"alt="Metis Logo">
      </div>
       </div>
      <div class="tab-content">
        <div id="login" class="tab-pane active">
          <form action="logar"   method="post" class="form-signin">
          <%--  <input type="text" id='idNaoLogado' value="<c:choose><c:when test="${naoLogado==true}">true</c:when><c:otherwise>false</c:otherwise></c:choose>"/> --%>
           
            <p class="text-muted text-center">
              Administrador, insira seu usu&aacute;rio e senha
            </p>
            <input type="text" id="txtEmail"  name="txtEmail"placeholder="Username" class="form-control">
            <input type="password"  id="txtSenha" name="txtSenha" placeholder="Password" class="form-control">
            <button class="btn btn-lg btn-primary btn-block" id="btnLogar" value="btnLogar" type="submit" >Entrar</button>
          </form>
        </div>
        <div id="forgot" class="tab-pane">
          <form action="index" class="form-signin">
            <p class="text-muted text-center">Enter your valid e-mail</p>
            <input type="email" placeholder="mail@domain.com" required="required" class="form-control">
            <br>
            <button class="btn btn-lg btn-danger btn-block" type="button">Recover Password</button>
          </form>
        </div>
        <div id="signup" class="tab-pane">
          <form action="index.html" class="form-signin">
            <input type="text" placeholder="username" class="form-control">
            <input type="email" id='txtEmail'placeholder="mail@domain.com" class="form-control">
            <input type="password" id='txtSenha'placeholder="password" class="form-control">
            <button class="btn btn-lg btn-success btn-block" type="button" >Register</button>
          </form>
        </div>
      </div>
      <div class="text-center">
        <ul class="list-inline">
          <li> <a class="text-muted" href="index">Voltar para Easy Cook</a>  </li>

        </ul>
      </div>
    </div><!-- /container -->
    <script src="dist/assets/lib/jquery.min.js"></script>
    <script src="dist/assets/lib/bootstrap/js/bootstrap.js"></script>
    <script>
      $('.list-inline li > a').click(function() {
        var activeForm = $(this).attr('href') + ' > form';
        //console.log(activeForm);
        $(activeForm).addClass('magictime swap');
        //set timer to 1 seconds, after that, unload the magic animation
        setTimeout(function() {
          $(activeForm).removeClass('magictime swap');
        }, 1000);
      });
    </script>
  </body>
</html>
