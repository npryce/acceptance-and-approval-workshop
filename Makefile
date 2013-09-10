
MD_SRC:=$(wildcard *.md)

.PHONY: all
all: out/handout.pdf
all: out/README.pdf
all: out/exercise.zip

out/%.pdf: %.md
	@mkdir -p $(dir $@)
	pandoc --standalone -f markdown_github+simple_tables -o $@ $<

out/exercise.zip: exercise/out/exercise.zip
	cp $< $@

exercise/out/exercise.zip:
	(cd exercise; ant exercise-zip)

.PHONY: clean
clean:
	rm -rf out/ exercise/out/ exercise-lib/out/

.PHONY: again
again: clean all

