# Chose file

## Class 

| Type Class | Name | Description |
| ------------ | ------ | ---------------------- |
| Jframe | ChonFIle | Go to select file |
| Jframe | GUI | Show select file |


## About

In this, 
I create 1 file name "Chonfile" have a Jfilechose, when it file selected:
<br>

File selectedFile = jFileChooser1.getSelectedFile();<br>
this.setName( selectedFile.toString() );<br>
this.dispose();<br>

And file GUI to check it:<br>
ChonFile cf = new ChonFile(this, true);<br>
cf.setVisible(true);<br>
jLabel1.setText(cf.getName());