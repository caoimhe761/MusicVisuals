# Music Visualiser Project

Name: Caoimhe McCann and Rebecca Foley

Student Number:  C20365106 and C20301121

## Instructions
- Fork this repository and use it a starter project for your assignment COMPLETE
- Create a new package named your student number and put all your code in this package.
- You should start by creating a subclass of ie.tudublin.Visual
- There is an example visualiser called MyVisual in the example package
- Check out the WaveForm and AudioBandsVisual for examples of how to call the Processing functions from other classes that are not subclasses of PApplet

# Description of the assignment

Rebecca and I have created an audio visualisation for the song Amsterdam by Nothing but thieves. Using Audio player, buffer and pApplet we created several visualisations for the assignment. We wanted to make sure that the visualisations could be used in connection with each other. We had an option for making the visualisations automatic and allowing the user to switch between each visual. This allows for optimum visualisation of the project and control over what can be seen.

# Instructions

#what the controls are
The controls are simple using switch statements to see each visual, the default mode is the automated visuals for the song and from there you can switch to each visual using the numbers. There is also an option to mute the audio and still have the  visuals by pressing ‘m’ and by pressing the space bar you can pause the visual and rewind the process back to the beginning of the song 
# How it works

# What I am most proud of in the assignment

*Caoimhe McCann*
What I am most proud of is connecting Rebecca and my code together to create the automated case for the video. The timing for the visuals including mixing and matching the methods to create different backgrounds with visuals in front of it. Finding out what visuals looked good in which section of music was very satisfaction and getting the transitions right was very pleasing. I was also proud of the swirly background with the circular clock rotation, for this I was inspired by the image loading symbol but I wanted it to move to the music, I have to higher the sensitivity a lot so that it would work for the quiet part of the song
-	Automation
-	Swirley background and loading circles


# Markdown Tutorial


This is a [hyperlink](http://bryanduggan.org)

# Headings
## Headings
#### Headings
##### Headings

This is code:

```Java
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

So is this without specifying the language:

```
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

This is an image using a relative URL:

![An image](images/p8.png)

This is an image using an absolute URL:

![A different image](https://bryanduggandotorg.files.wordpress.com/2019/02/infinite-forms-00045.png?w=595&h=&zoom=2)

This is a youtube video:

[![YouTube](http://img.youtube.com/vi/J2kHSSFA4NU/0.jpg)](https://www.youtube.com/watch?v=J2kHSSFA4NU)

This is a table:

| Heading 1 | Heading 2 |
|-----------|-----------|
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |

