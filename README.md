# lab-3-client

Small project to act as client to #lab-3-server project.

After statring this project make this request:
```
http://localhost:8002/lucky-word
```
And you should see the value for lucky-word set in the lab-3-server project.

## Spring Profiles
If you look into lab-3-server repository you will see there's two files:
* lucky-word.yml
* lucky-word-northamerica.yml

Both have different values for lucky-word key.

In lab-3-client look at bootstrap.yml and you'll see that northamerica profile is set.
That will make you see "keterin" in web browser.
Remove the northamerica profile or remove it (fallback for default), stop and start the client and you're going to see "tobias"
