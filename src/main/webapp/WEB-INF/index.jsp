<%-- 
    Document   : index.jsp
    Created on : 21 nov. 2020, 14:48:16
    Author     : franck
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>JSP Page</title>
        <base href="">
        <link href="assets/css/bootstrap.min.css" rel="stylesheet" type="text/css">

        <style> form{
                margin-top: 50px;
            }       </style>

    </head>
    <body>



        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="Vesperr/index.html">Navbar</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Link</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Dropdown
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="#">Action</a>
                            <a class="dropdown-item" href="#">Another action</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="#">Something else here</a>
                        </div>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link disabled" href="#">Disabled</a>
                    </li>
                </ul>
                <form class="form-inline my-2 my-lg-0">
                    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                </form>
            </div>
        </nav>








        <div class="container">
            <!-- Content here -->
            <div class="row">
                <div>
                    <form>
                        <div class="form-row">
                            <div class="form-group col-md-6">
                                <label for="titre">Titre de la lecon</label>
                                <input type="text" class="form-control" id="titre" placeholder="Titre de la lecon">
                            </div>
                            <div class="form-group col-md-6">
                                <label for="inputState">Chapitre</label>
                                <select id="inputState" class="form-control">
                                    <option selected>Choisir...</option>
                                    <option>...</option>
                                    <option>...</option>
                                </select>                            
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputAddress">Description</label>
                            <input type="text" class="form-control" id="inputAddress" placeholder="Brêve description de la lecon">
                        </div>
                        <div class="form-group">
                            <label for="inputAddress2">Address 2</label>
                            <textarea type="text" class="form-control" id="editeur"></textarea>
                        </div>


                        <div class="form-group row">
                            <label for="exampleFormControlFile1" class="col-sm-4 col-form-label">Joindre un fichier Video</label>
                            <div class="col-sm-8">
                                <input type="file" class="form-control-file" id="exampleFormControlFile1">
                            </div>
                        </div>

                      
                        <button type="submit" class="btn btn-primary">Valider</button>
                    </form>

                </div>
            </div>


        </div>




        <script src="assets/jquery/jquery.min.js"></script>
        <script src="assets/bootstrap/js/bootstrap.min.js"></script>
        <script src="assets/ckeditor/ckeditor.js"></script>
        <script src="assets/ckeditor/ckeditor.js.map"></script>

        <script>
            ClassicEditor
                    .create(document.querySelector('#editeur'))
                    .then(editor => {
                        console.log(editor);
                    })
                    .catch(error => {
                        console.error(error);
                    });
        </script>



    </body>
</html>
