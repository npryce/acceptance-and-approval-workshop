
dataset=atmospheric-co2-1992.csv
out=out/accepting-the-unexpectable

.PHONY: all

all: $(out).tgz

$(out).tgz: $(out)/handout.md
$(out).tgz: $(patsubst skeleton-projects/%,$(out)/%,$(wildcard skeleton-projects/python-pytest/*.py))
$(out).tgz: $(out)/$(dataset)
$(out).tgz: $(patsubst %,$(out)/%,$(wildcard templates/*))
$(out).tgz:
	cd $(dir $@); tar czf $(notdir $@) $(notdir $(basename $@))

$(out)/%.md: %.md
	@mkdir -p $(dir $@)
	sed -e 's:{dataset}:$(dataset):g' $< > $@

$(out)/$(dataset): datasets/$(dataset)
	@mkdir -p $(dir $@)
	cp $< $@

$(out)/templates/%: templates/%
	@mkdir -p $(dir $@)
	cp $< $@

$(out)/%: skeleton-projects/%
	@mkdir -p $(dir $@)
	cp $< $@

.PHONY: clean
clean:
	rm -rf out/

.PHONY: again
again: clean all


