<!doctype html>
<html lang="en">

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
        crossorigin="anonymous">

    <title>Register</title>
</head>

<body class="bg-dark">
    
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut"crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
	<script src="https://code.jquery.com/jquery-3.3.1.js"></script>
    
    <div class="border bg-secondary rounded container" style="margin-top: 20px; padding: 12px; max-width: 40%">
        <h1 style ="cursor: default">REGISTER</h1>
        <form action="guardarusuario" method="POST">
            <div class="form-row">
                <div class="form-group col-md-12">
                    <label for="inputUsername">Username</label>
                    <input type="text" class="form-control" id="inputUsername" placeholder="Username" name="inputUsername">
                </div>
                <div class="form-group col-md-12">
                    <label for="inputPassword">Password</label>
                    <input type="password" class="form-control" id="inputPassword" placeholder="Password" name="inputPassword">
                </div>
                <div class="form-group col-md-12">
                    <label for="inputEmail">Email</label>
                    <input type="email" class="form-control" id="inputEmail" placeholder="Email" name="inputEmail">
                </div>
            </div>
            <div class="form-group">
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" id="gridCheck"  style ="cursor: pointer">
                    <label class="form-check-label" for="gridCheck"  style ="cursor: pointer">
                        Check me out
                    </label>
                </div>
            </div>
            <button id="submit" type="submit" class="btn btn-outline-dark text-light bg-dark">Sign in</button>
        </form>
    </div>
    
	<script>
		if ($('#gridCheck').prop("checked")==true) {
        	$('#submit').fadeIn();

      	}else{
    		$('#submit').hide();
    		$('#submit').fadeOut();
      	}
	
     	$('#gridCheck').on("change", function () {

        if ($('#gridCheck').prop("checked")==true) {
          $('#submit').fadeIn();
 
        }else{
          $('#submit').fadeOut();
        }
      });
    </script>
    
</body>

</html>