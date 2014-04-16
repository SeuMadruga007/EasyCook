<!DOCTYPE html>
<html lang="en">
    <head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>Easy Cook Admin - Categoria Alterar Consultar</title>
<c:import url="importAdminFiles.jsp" />
</head>
  <body>
    <div id="wrap">
      <div id="top">

         <c:import url="importAdminNav.jsp" />

        <!-- header.head -->
        <header class="head">
          <div class="search-bar">
            <a data-original-title="Show/Hide Menu" data-placement="bottom" data-tooltip="tooltip" class="accordion-toggle btn btn-primary btn-sm visible-xs" data-toggle="collapse" href="#menu" id="menu-toggle">
              <i class="fa fa-expand"></i>
            </a> 
            <form class="main-search">
              
            </form>
          </div>

          <!-- ."main-bar -->
          <div class="main-bar">
            <h3>
               <i class="fa fa-cutlery"></i> Incluir Receita </h3>
          </div><!-- /.main-bar -->
        </header>

        <!-- end header.head -->
      </div><!-- /#top -->
      
      <c:import url="importAdminMenuLateral.jsp" />
      
      <div id="content">
        <div class="outer">
          <div class="inner">
            <div class="col-lg-12">
              <div class="form-group">
              <br><br><br>
				<label for="nome" class="control-label col-lg-1">Nome</label>
				<div class="col-lg-8">
					<input type="text" id="txtTitulo"
						placeholder="Insira o nome da receita aqui" class="form-control">
				</div>
				</div>
						<br><br><br>
				   <div class="form-group">
                        <label  class="control-label col-lg-1">Categoria</label>
                        <div class="col-lg-3">
                          <select data-placeholder="Escolha uma categoria..." class="form-control chzn-select" multiple tabindex="10">
                            <option value="ESSAS OPCOES VIRAO DO BANCO FUTURAMENTE"></option>
                            <option value="Saladas">Saladas</option>
                            <option value="Aves">Aves</option>
                            <option value="Massas">Massas</option>
                            <option value="Carnes">Carnes</option>
                            <option value="Peixes e frutos do mar">Peixes e frutos do mar</option>                      
                            <option value="Sopas">Sopas</option>                      
                            <option value="Lanches">Lanches</option>                      
                            <option value="Bolos">Bolos</option>                                              
                            <option value="Doces">Doces</option>                      
                            <option value="Outros">Outros</option> 
                          </select>
                        </div>
                   </div><br><br>
                   <div class="form-group">
                        <label class="control-label col-lg-1">Porções</label>
                        <div class="col-lg-4">
                          <select title ="Selecione o rendimento esperado da receita.." data-placeholder="Selecione o rendimento esperado da receita.." class="form-control chzn-select" tabindex="2">
                            <option value="ESSAS OPCOES VIRAO DO BANCO FUTURAMENTE"></option>
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>
                            <option value="6">6</option>
                            <option value="7">7</option>
                            <option value="8">8</option>
                            <option value="9">9</option>
                            <option value="10">10</option>
                            <option value="11">11</option>
                            <option value="12">12</option>
                            <option value="13">13</option>
                            <option value="14">14</option>
                            <option value="15">15</option>
                            <option value="16">16</option>
                            <option value="17">17</option>
                            <option value="18">18</option>
                            <option value="19">19</option>
                            <option value="20">20</option>
                          </select>
                        </div>
                      </div>		
						
                   <br><br>
                   <div class="form-group">
                        <label class="control-label col-lg-1">Tempo</label>
                        <div class="col-lg-4">
                          <select data-placeholder="Selecione o tempo de preparo..." class="form-control chzn-select" tabindex="2">
                            <option value="ESSAS OPCOES VIRAO DO BANCO FUTURAMENTE"></option>
                            <option value="Até 15 min">Até 15 min</option>
                            <option value="Entre 15 min e 30 min">Entre 15 min e 30 min</option>
                            <option value="Entre 30 min e 1 hora">Entre 30 min e 1 hora</option>
                            <option value="+1 hora">+1 hora</option>
                          </select>
                        </div>
                      </div>		
						<br><br><br>
						
                 <h4>Selecione 3 ingredientes principais dessa receita</h4>
                  <div id="div-3" class="accordion-body collapse in body">
                    <div class="row">
                      <div class="col-lg-5">
                        <div class="form-group">
                          <div class="input-group">
                            <input id="box1Filter" type="text" placeholder="Filter" class="form-control">
                            <span class="input-group-btn">
                                    <button id="box1Clear" class="btn btn-warning" type="button">x</button>
                                </span> 
                          </div><!-- /input-group -->
                        </div><!-- /.form-group -->
                        <div class="form-group">
                          <select id="box1View" multiple="multiple" class="form-control" size="16">
                            <option value="501649">ESSAS OPCOES VIRAO DO BANCO FUTURAMENTE</option>
                            <option value="501649">Farinha</option>
                            <option value="501497">Ovo</option>
                            <option value="501053">Atum</option>
                            <option value="500001">Brigadeiro</option>
                            <option value="501227">Queijo</option>
                            
                          </select>
                          <hr>
                          <div class="alert alert-block">
                            <span id="box1Counter" class="countLabel"></span> 
                            <select id="box1Storage" class="form-control"></select>
                          </div>
                        </div><!-- /.form-group -->
                      </div><!-- /.col-lg-5 -->
                      <div class="col-lg-2">
                        <div class="btn-group btn-group-vertical" style="white-space: normal;">
                          <button id="to2" type="button" class="btn btn-primary">
                            <i class="fa fa-chevron-right"></i>
                          </button>
                          
                          <button id="allTo1" type="button" class="btn btn-danger">
                            <i class="fa fa-backward"></i>
                          </button>
                          <button id="to1" type="button" class="btn btn-danger">
                            <i class=" fa fa-chevron-left fa fa-white"></i>
                          </button>
                        </div>
                      </div><!-- /.col-lg-2 -->
                      <div class="col-lg-5">
                        <div class="form-group">
                          <div class="input-group">
                            <input id="box2Filter" type="text" placeholder="Filter" class="form-control">
                            <span class="input-group-btn">
                                    <button id="box2Clear" class="btn btn-warning" type="button">x</button>
                                </span> 
                          </div><!-- /input-group -->
                        </div><!-- /.form-group -->
                        <div class="form-group">
                          <select id="box2View" multiple="multiple" class="form-control" size="3"></select>
                        </div><!-- /.form-group -->
                        <hr>
                        <div class="alert alert-block">
                          <span id="box2Counter" class="countLabel"></span> 
                          <select id="box2Storage" class="form-control"></select>
                        </div>
                      </div><!-- /.col-lg-5 -->
                    </div>
                  </div>
                  <br>
                   
                  <div class="form-group">
                        <label class="control-label col-lg-4">Relacionar receita com estilo de vida</label>
                        <div class="col-lg-8">
                          <select data-placeholder="Selecione aqui os estilos..." multiple class="form-control chzn-select  chzn-rtl" tabindex="10">
                            <option value=""></option>
                            <option>Sem glúten</option>
                            <option>Vegetariano</option>
                            <option>Light</option>
                            <option>Diet</option>
                          </select>
                        </div>
                      </div>
                  
                  <br><br><br>
                  <h4>Modo de preparo</h4>
                  <br>
                  <textarea class="form-control" rows="20" placeholder="Insira aqui o modo de preparo da receita."></textarea>
                   
                  <br><br><br>
 
                  <h4>Ingredientes da receita</h4>
                  <br>
                  <textarea class="form-control" rows="20" placeholder="Insira aqui os ingredientes da receita."></textarea>
                   
                  <br><br><br>
                   <h4>Upload de Imagens</h4>
                  <!-- File Button --> 
				<div class="control-group">
  				 
  				<div class="controls">
    			  <input id="filebutton" name="filebutton" class="input-file" type="file">
  				</div>
				</div>
                <br><br><br>
                <button type="submit" class="btn btn-primary">Salvar</button>
                <br><br>
            </div>
          </div>
          <!-- end .inner -->
        </div>
        <!-- end .outer -->
      </div>
      <!-- end #content -->
    </div><!-- /#wrap -->
    <div id="footer">
      <p>Easy Cook Admin</p>
    </div>
    <script src="dist/assets/lib/jquery.min.js"></script>
    <script src="dist/assets/lib/bootstrap/js/bootstrap.min.js"></script>
    <script src="//ajax.googleapis.com/ajax/libs/jqueryui/1.10.3/jquery-ui.min.js"></script>
    <script src="dist/assets/lib/uniform/jquery.uniform.min.js"></script>
    <script src="dist/assets/lib/inputlimiter/jquery.inputlimiter.1.3.1.min.js"></script>
    <script src="dist/assets/lib/chosen/chosen.jquery.min.js"></script>
    <script src="dist/assets/lib/colorpicker/js/bootstrap-colorpicker.js"></script>
    <script src="dist/assets/lib/tagsinput/jquery.tagsinput.min.js"></script>
    <script src="dist/assets/lib/validVal/src/js/jquery.validVal.min.js"></script>
    <script src="dist/assets/lib/daterangepicker/daterangepicker.js"></script>
    <script src="dist/assets/lib/daterangepicker/moment.min.js"></script>
    <script src="dist/assets/lib/datepicker/js/bootstrap-datepicker.js"></script>
    <script src="dist/assets/lib/timepicker/js/bootstrap-timepicker.min.js"></script>
    <script src="dist/assets/lib/switch/build/js/bootstrap-switch.min.js"></script>
    <script src="dist/assets/lib/jquery.dualListbox-1.3/jquery.dualListBox-1.3.min.js"></script>
    <script src="dist/assets/lib/autosize/jquery.autosize.min.js"></script>
    <script src="dist/assets/lib/jasny/js/jasny-bootstrap.min.js"></script>
    <script src="dist/assets/js/main.min.js"></script>
    <script>
      $(function() {
        formGeneral();
      });
    </script>
  </body>
</html>