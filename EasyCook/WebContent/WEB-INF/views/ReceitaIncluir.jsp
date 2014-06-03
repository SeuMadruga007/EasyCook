<!DOCTYPE html >
<html  lang="en" >
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
 <head>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>Easy Cook Admin - Categoria Alterar Consultar</title>
	<c:import url="importAdminFiles.jsp" />
	
<script  src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<script type="text/javascript">
	
	function incluirEstiloVida(){
		var nome = $('#txtNome').val();
		
		
		if(nome==null||nome==''){
			alert('Favor inserir um nome para o Estilo de Vida.');
		}else{
			$.ajax({url:'incluirEstiloVida',data:({
				 estiloVida:nome}),
				 type:"POST",
					success:function(dados){
							if(dados=='sucesso'){
								alert('Estilo de Vida cadastrado com sucesso!');
								$('#txtNome').val('');
							}else if(dados=='existe'){
								alert('Já existe um Estilo de Vida com esse Nome.');
							}else
								alert('Erro ao cadastrar Estilo de Vida!');
					}
			}); 
			
		}		
		
	}

	
</script>
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
					<input type="text" id="txtNomeReceita"
						placeholder="Insira o nome da receita aqui" class="form-control">
				</div>
				</div>
						<br><br>
				   <h4>Relacionar categorias</h4>
                  <div id="div-3" class="accordion-body collapse in body">
                    <div class="row">
                      <div class="col-lg-5">
                        <div class="form-group">
                          <div class="input-group">
                            <input id="filtroBoxCategoria" type="text" placeholder="Filter" class="form-control">
                            <span class="input-group-btn">
                                    <button id="boxCategoriaLimpa" class="btn btn-warning" type="button" id='btnLimparFiltroCategoria'>x</button>
                                </span> 
                          </div><!-- /input-group -->
                        </div><!-- /.form-group -->
                        <div class="form-group">
                          <select id="boxCategoria" name='boxCategoria' multiple="multiple" class="form-control" size="09">
                            <option value="501649">categ 1</option>
                            <option value="501497">categ 2</option>
                            <option value="501053">categ 3</option>
                          </select>
                          <hr>
                        
                        </div><!-- /.form-group -->
                      </div><!-- /.col-lg-5 -->
                      
                      
                      <div class="col-lg-2">
                        <div class="btn-group btn-group-vertical" style="white-space: normal;">
                        
                        <!--  btn '>' -->
                          <button id="btnAdicionarCategoria" type="button" class="btn btn-primary">
                            <i class="fa fa-chevron-right"></i>
                          </button>
                          
                          <!--  btn '<<' -->
                          <button id="btnRemoverTodasCategorias" type="button" class="btn btn-danger">
                            <i class="fa fa-backward"></i>
                          </button>
                          
                          <!--  btn '<' -->
                          <button id="btnRemoverCategoria" type="button" class="btn btn-danger">
                            <i class=" fa fa-chevron-left fa fa-white"></i>
                          </button>
                        </div>
                      </div><!-- /.col-lg-2 -->
                      
                      
                      <div class="col-lg-5">
                        <div class="form-group">
                          <div class="input-group">
                            <input id="filtroBoxCategoria2" type="text" placeholder="Filter" class="form-control">
                            <span class="input-group-btn">
                                    <button id="btnLimparFiltroCategoriaAdicionada" class="btn btn-warning" type="button">x</button>
                                </span> 
                          </div><!-- /input-group -->
                        </div><!-- /.form-group -->
                        <div class="form-group">
                          <select id="boxCategoriaAdicionada" multiple="multiple" class="form-control" size="9"></select>
                        </div><!-- /.form-group -->
                        <hr>
                       
                      </div><!-- /.col-lg-5 -->
                    </div>
                  </div>
                  
					<div class="form-group">
						<br>
						 <label for="nome" class="control-label col-lg-1">Porções</label>
							<div class="col-lg-8">
								<input type="text" id="txtPorcao" placeholder="Insira a porção aqui" class="form-control">
							</div>
					</div>
						<br><br>
						
                 <h4>Selecione 3 ingredientes principais dessa receita</h4>
                  <div id="div-3" class="accordion-body collapse in body">
                    <div class="row">
                      <div class="col-lg-5">
                        <div class="form-group">
                          <div class="input-group">
                            <input id="boxIngrediente" type="text" placeholder="Filter" class="form-control">
                            <span class="input-group-btn">
                                    <button id="btnFiltroIngredienteLimpar" class="btn btn-warning" type="button">x</button>
                                </span> 
                          </div><!-- /input-group -->
                        </div><!-- /.form-group -->
                        <div class="form-group">
                          <select id="boxIngrediente" multiple="multiple" class="form-control" size="09">
                            <option value="501649">Farinha</option>
                            <option value="501497">Ovo</option>
                            <option value="501053">Atum</option>
                            <option value="500001">Brigadeiro</option>
                            <option value="501227">Queijo</option>
                            
                          </select>
                          <hr>
                        </div><!-- /.form-group -->
                      </div><!-- /.col-lg-5 -->
                      <div class="col-lg-2">
                        <div class="btn-group btn-group-vertical" style="white-space: normal;">
                          <button id="btnAdicionarIngrediente" type="button" class="btn btn-primary">
                            <i class="fa fa-chevron-right"></i>
                          </button>
                          
                          <button id="btnRemoverTodosIngredientesAdicionados" type="button" class="btn btn-danger">
                            <i class="fa fa-backward"></i>
                          </button>
                          <button id="btnRemoverIngredienteAdicionado" type="button" class="btn btn-danger">
                            <i class=" fa fa-chevron-left fa fa-white"></i>
                          </button>
                        </div>
                      </div><!-- /.col-lg-2 -->
                      <div class="col-lg-5">
                        <div class="form-group">
                          <div class="input-group">
                            <input id="boxIngredienteFiltro2" type="text" placeholder="Filter" class="form-control">
                            <span class="input-group-btn">
                                    <button id="btnFiltroIngredienteAdicionadoLimpar" class="btn btn-warning" type="button">x</button>
                                </span> 
                          </div><!-- /input-group -->
                        </div><!-- /.form-group -->
                        <div class="form-group">
                          <select id="boxIngredienteAdicionado" multiple="multiple" class="form-control" size="09"></select>
                        </div><!-- /.form-group -->
                        <hr>
                      </div><!-- /.col-lg-5 -->
                    </div>
                  </div>
                  <br>
                   
                   <div class="form-group">
						
						 <label for="nome" class="control-label col-lg-1">Tempo</label>
							<div class="col-lg-8">
								<input type="text" id="txtTempo" placeholder="Exmeplo: 15" class="form-control">
							</div>
					</div>		
						<br>
             	<br>
				   <h4>Relacionar receita com estilo de vida</h4>
                  <div id="div-3" class="accordion-body collapse in body">
                    <div class="row">
                      <div class="col-lg-5">
                        <div class="form-group">
                          <div class="input-group">
                            <input id="filtroBoxEstilo" type="text" placeholder="Filter" class="form-control">
                            <span class="input-group-btn">
                                    <button id="btnLimparFiltroEstiloVida" class="btn btn-warning" type="button">x</button>
                                </span> 
                          </div><!-- /input-group -->
                        </div><!-- /.form-group -->
                        <div class="form-group">
                          <select id="boxEstilo" multiple="multiple" class="form-control" size="09">
                            <option value="501649">Estilo 1</option>
                            <option value="501497">Estilo 2</option>
                            <option value="501053">Estilo 3</option>
                          </select>
                          <hr>
                        
                        </div><!-- /.form-group -->
                      </div><!-- /.col-lg-5 -->
                      <div class="col-lg-2">
                        <div class="btn-group btn-group-vertical" style="white-space: normal;">
                          <button id="btnAdicionarEstiloVida" type="button" class="btn btn-primary">
                            <i class="fa fa-chevron-right"></i>
                          </button>
                          
                          <button id="btnRemoverTodosEstilosVida" type="button" class="btn btn-danger">
                            <i class="fa fa-backward"></i>
                          </button>
                          <button id="btnRemoverEstiloVida" type="button" class="btn btn-danger">
                            <i class=" fa fa-chevron-left fa fa-white"></i>
                          </button>
                        </div>
                      </div><!-- /.col-lg-2 -->
                      <div class="col-lg-5">
                        <div class="form-group">
                          <div class="input-group">
                            <input id="filtroBoxEstilo2" type="text" placeholder="Filter" class="form-control">
                            <span class="input-group-btn">
                                    <button id="btnLimparFiltroEstiloVidaAdicionado" class="btn btn-warning" type="button">x</button>
                                </span> 
                          </div><!-- /input-group -->
                        </div><!-- /.form-group -->
                        <div class="form-group">
                          <select id="boxEstiloVidaAdicionado" multiple="multiple" class="form-control" size="9"></select>
                        </div><!-- /.form-group -->
                        <hr>
                       
                      </div><!-- /.col-lg-5 -->
                    </div>
                  </div>
             
                  <br>
                  <h4>Modo de preparo</h4>
                  <br>
                  <textarea class="form-control" rows="10" id='txtAreaModoPreparo' placeholder="Insira aqui o modo de preparo da receita."></textarea>
                   
                  <br><br><br>
 
                  <h4>Ingredientes da receita</h4>
                  <br>
                  <textarea class="form-control" rows="10" id='txtAreaingredientesReceita'placeholder="Insira aqui os ingredientes da receita."></textarea>
                   
                  <br><br><br>
                   <h4>Upload de Imagens</h4>
                  <!-- File Button --> 
				<div class="control-group">
  				 
  				<div class="controls">
    			  <input id="filebutton" name="filebutton" class="input-file" type="file">
  				</div>
				</div>
                <br><br><br>
                <button type="button" id='btnIncluirReceita' class="btn btn-primary">Salvar</button>
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
