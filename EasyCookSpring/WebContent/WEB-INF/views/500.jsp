<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <title>Erro</title>
    <meta name="msapplication-TileColor" content="#5bc0de" />
    <meta name="msapplication-TileImage" content="dist/assets/img/metis-tile.png" />
    <link rel="stylesheet" href="dist/assets/lib/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="dist/assets/css/main.css">
    <link rel="stylesheet" href="dist/assets/lib/magic/magic.css">
    <link rel="stylesheet" href="dist/assets/lib/Font-Awesome/css/font-awesome.css" />
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
  </head>
  <body class="error">
    <div class="container">
      <div class="col-lg-8 col-lg-offset-2 text-center">
        <div class="logo">
          <h1>Erro</h1>
        </div>
        <p class="lead text-muted">Oops, parece que voc&ecirc; n&atilde;o possui acesso ou o servidor se comportou de maneira inesperada.</p>
        <div class="clearfix"></div>
        <div class="col-lg-6 col-lg-offset-3">
          <form action="index.html">
            <div class="input-group">
              <input type="text" placeholder="Procurar receitas ..." class="form-control">
              <span class="input-group-btn">
			<button class="btn btn-default" type="button"><i class="fa fa-search"></i></button>
		      </span> 
            </div>
          </form>
        </div>
        <div class="clearfix"></div>
        <br>
        <div class="col-lg-6  col-lg-offset-3">
          <div class="btn-group btn-group-justified">
            <!-- <a href="dashboard.html" class="btn btn-info">Return Dashboard</a>  -->
            <a href="index" class="btn btn-warning">Retornar para Easy Cook</a> 
          </div>
        </div>
      </div><!-- /.col-lg-8 col-offset-2 -->
    </div>
  </body>
</html>
