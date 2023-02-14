<html>
<head>
<meta charset="ISO-8859-1">
<title>Upload Multiple Files</title>
</head>
<body>
    <form method="post" action="MFUploading" enctype="multipart/form-data">
        <h3>Choose files to upload...</h3>
        <input type="file" name="file1"/><br><br>
        <input type="file" name="file2"/><br><br>
        <!-- <input type="file" name="file3"/><br><br> -->
        <input type="submit"/>
    </form>
</body>
</html>