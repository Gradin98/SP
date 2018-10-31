format 220

classcanvas 128002 class_ref 128002 // Book
  classdiagramsettings member_max_width 0 end
  xyzwh 524.5 63 2000 111 47
end
classcanvas 128130 class_ref 128130 // Author
  classdiagramsettings member_max_width 0 end
  xyzwh 336.5 61 2000 123 47
end
classcanvas 128386 class_ref 128258 // TableOfContents
  classdiagramsettings member_max_width 0 end
  xyzwh 686 63 2000 121 47
end
classcanvas 128642 class_ref 128386 // Chapter
  classdiagramsettings member_max_width 0 end
  xyzwh 525.5 149.5 2000 113 53
end
classcanvas 129154 class_ref 128514 // Image
  classdiagramsettings member_max_width 0 end
  xyzwh 390 421.2 2000 113 59
end
classcanvas 130434 class_ref 128642 // SubChapter
  classdiagramsettings member_max_width 0 end
  xyzwh 526 242.5 2000 113 47
end
classcanvas 130562 class_ref 128770 // Paragraph
  classdiagramsettings member_max_width 0 end
  xyzwh 529.5 421.2 2000 113 59
end
classcanvas 131458 class_ref 128898 // Table
  classdiagramsettings member_max_width 0 end
  xyzwh 657.5 420.3 2000 113 59
end
classcanvas 133890 class_ref 135554 // Element
  classdiagramsettings member_max_width 0 end
  xyzwh 529.5 323.5 2000 113 45
end
relationcanvas 128258 relation_ref 128002 // <aggregation>
  from ref 128002 z 2001 to ref 128130
  no_role_a no_role_b
  no_multiplicity_a no_multiplicity_b
end
relationcanvas 128514 relation_ref 128130 // <association>
  from ref 128002 z 2001 to ref 128386
  no_role_a no_role_b
  no_multiplicity_a no_multiplicity_b
end
relationcanvas 128770 relation_ref 128258 // <composition>
  decenter_end 486
  from ref 128002 z 2001 to ref 128642
  no_role_a no_role_b
  no_multiplicity_a no_multiplicity_b
end
relationcanvas 131330 relation_ref 128642 // <composition>
  from ref 128642 z 2001 to ref 130434
  no_role_a no_role_b
  no_multiplicity_a no_multiplicity_b
end
relationcanvas 134018 relation_ref 136066 // <composition>
  decenter_end 477
  from ref 130434 z 2001 to ref 133890
  no_role_a no_role_b
  no_multiplicity_a no_multiplicity_b
end
relationcanvas 134274 relation_ref 136322 // <generalisation>
  geometry VHV unfixed
  from ref 131458 z 2001 to point 711 392
  line 134530 z 2001 to point 583 392
  line 134658 z 2001 to ref 133890
  no_role_a no_role_b
  no_multiplicity_a no_multiplicity_b
end
relationcanvas 134402 relation_ref 136450 // <generalisation>
  geometry VHV
  from ref 129154 z 2001 to point 444 392
  line 135042 z 2001 to point 583 392
  line 135170 z 2001 to ref 133890
  no_role_a no_role_b
  no_multiplicity_a no_multiplicity_b
end
relationcanvas 135298 relation_ref 136578 // <association>
  from ref 130562 z 2001 to ref 133890
  no_role_a no_role_b
  no_multiplicity_a no_multiplicity_b
end
end
