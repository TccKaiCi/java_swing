# Chose file

## Class 

| Type Class | Name | Description |
| ------------ | ------ | ---------------------- |
| Jframe | ChonFIle | Go to select file |
| Jframe | GUI | Show select file |


## About

In this, 
I create 1 file name "Chonfile" have a Jfilechose, when it file selected:

```java
File selectedFile = jFileChooser1.getSelectedFile();
this.setName( selectedFile.toString() );
this.dispose();
```

And file GUI to check it:

```java
ChonFile cf = new ChonFile(this, true);
cf.setVisible(true);
jLabel1.setText(cf.getName());
```
