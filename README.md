# Fancy Progress Dialog
![Error Dialog](error.png)
![Success Dialog](success.png)
![Info Dialog](info.png)

A fancy animated progress dialog having 12 loaders. My purpose is to replace the android default progress dialog which is deprecated now.
I have made this in a short time and now uploading it for others. 
If you find it helpfull  then kindly share it and give atleast a star.

## How to include in your project

### Step1: Add it in your root build.gradle at the end of repositories:
`allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}` 
  
  ### Step 2. Add the dependency
  `

	dependencies {
    implementation 'com.github.farimarwat:fancy-progress-dialog:1.0'
	}

`
### Usage:

```
 val dialog = FancyProgressDialog.Builder(this)
            .setLoader(FancyProgressDialog.LOADER_02)
            .setMessage("Loading...")
            .build()
        dialog.show()
```
